package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetStationDAOBean;
import com.postrofit.backend.Bean.Small.GetStorageDAOBean;
import com.postrofit.backend.Bean.Small.GetStoragePasswordDAOBean;
import com.postrofit.backend.Bean.Small.GetStoreDAOBean;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoragePasswordDAO;
import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Store3Bean {
    @Autowired
    GetStoreDAOBean getStoreDAOBean;
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    @Autowired
    GetStoragePasswordDAOBean getStoragePasswordDAOBean;
    @Autowired
    GetStationDAOBean getStationDAOBean;

    public StoragePasswordDTO exec(String userId) {

        // TODO 사용자 이름으로 보관 테이블 찾기 (1. 없으면 보관x 보냄, 2. 있으면 다음으로)
        StoreDAO storeDAO = getStoreDAOBean.exec(userId);

        // TODO 보관 테이블에서 보관함 아이디로 보관함DAO 가져오기
        StorageDAO storageDAO = getStorageDAOBean.exec(storeDAO);

        // TODO 보관함 아이디(StoreId)로 보관함 패스워드DAO 가져오기
        StoragePasswordDAO storagePasswordDAO = getStoragePasswordDAOBean.exec(storeDAO.getStoreId());
        // TODO 보관함 아이디로 역DAO 가져오기
        StationDAO stationDAO = getStationDAOBean.exec(storeDAO.getStoreId());

        // 리턴 DTO 생성
        StoragePasswordDTO storagePasswordDTO = new StoragePasswordDTO();
        storagePasswordDTO.setStoragePasswordDTO(stationDAO, storageDAO, storagePasswordDAO);

        // TODO retrun 보관함 위치, 보관함 패스워드
        return storagePasswordDTO;
   }
}
