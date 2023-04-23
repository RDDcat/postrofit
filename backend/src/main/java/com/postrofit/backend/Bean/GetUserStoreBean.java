package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetStationDAOBean;
import com.postrofit.backend.Bean.Small.GetStorageDAOBean;
import com.postrofit.backend.Bean.Small.GetStoreDAOBean;
import com.postrofit.backend.Bean.Small.GetStoreProfitBean;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Model.DTO.History.StoreDTO;
import com.postrofit.backend.Model.DTO.StoreProfitDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetUserStoreBean {
    @Autowired
    GetStoreDAOBean getStoreDAOBean;
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    @Autowired
    GetStationDAOBean getStationDAOBean;
    @Autowired
    GetStoreProfitBean getStoreProfitBean;

    public StoreDTO exec(long userId){
        // 현재 Store(보관) 정보 가져옴
        StoreDAO storeDAO = getStoreDAOBean.exec(userId);

        // Storage 가져옴
        StorageDAO storageDAO = getStorageDAOBean.exec(storeDAO);

        // Station 가져옴
        StationDAO stationDAO = getStationDAOBean.exec(storageDAO);

        // Station, Storage로 브랜드, 사이즈별 비용 계산
        StoreProfitDTO storeProfitDTO = getStoreProfitBean.exec(stationDAO, storageDAO);

        // 리턴
        StoreDTO storeDTO = new StoreDTO(stationDAO, storeDAO, storeProfitDTO);
        return storeDTO;
    }
}
