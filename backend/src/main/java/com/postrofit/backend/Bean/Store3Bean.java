package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetStorageDAOBean;
import com.postrofit.backend.Bean.Small.GetStoragePasswordDAOBean;
import com.postrofit.backend.Bean.Small.GetStoreDAOBean;
import com.postrofit.backend.Model.DAO.storageDAO;
import com.postrofit.backend.Model.DAO.storagePasswordDAO;
import com.postrofit.backend.Model.DAO.storeDAO;
import com.postrofit.backend.Model.DTO.Storage3DTO;
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

    public Storage3DTO exec(String userId) {

        // TODO 사용자 이름으로 보관 테이블 찾기 (1. 없으면 보관x 보냄, 2. 있으면 다음으로)
        storeDAO storeDAO = getStoreDAOBean.exec(userId);

        // TODO 보관 테이블에서 보관함 아이디로 보관함 테이블 가져오기
        storageDAO storageDAO = getStorageDAOBean.exec(storeDAO.getStorageId());

        // TODO 보관함 테이블에서 보관함 위치 정보 파싱
        Storage3DTO storage3DTO = new Storage3DTO();
        storage3DTO.setLocation(storage3DTO.getLocation());

        // TODO 보관함 아이디로 보관함 패스워드 테이블 가져오기
        storagePasswordDAO storagePasswordDAO = getStoragePasswordDAOBean.exec(storeDAO.getStoreId());

        // TODO 보관함 패스워드 테이블에서 패스워드 파싱
        storage3DTO.setPassword(storagePasswordDAO.getStoragePasswordId());

        // TODO retrun 보관함 위치, 보관함 패스워드

        return storage3DTO;
   }
}
