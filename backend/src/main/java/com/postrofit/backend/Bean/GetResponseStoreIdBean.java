package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.*;
import com.postrofit.backend.Model.DAO.*;
import com.postrofit.backend.Model.DTO.ResponseStoreSampleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetResponseStoreIdBean {
    @Autowired
    GetUserDAOBean getUserDAOBean;
    @Autowired
    GetStoreDAOBean getStoreDAOBean;
    @Autowired
    GetStationDAOBean getStationDAOBean;
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    @Autowired
    GetStoragePasswordDAOBean getStoragePasswordDAOBean;

    public ResponseStoreSampleDTO exec(long storeId) {
        StoreDAO storeDAO = getStoreDAOBean.exec(storeId);

        // store id 로 storage, station 조회
        StorageDAO storageDAO = getStorageDAOBean.exec(storeDAO);
        StationDAO stationDAO = getStationDAOBean.exec(storageDAO);
        StoragePasswordDAO storagePasswordDAO = getStoragePasswordDAOBean.exec(storageDAO);

        // mapping
        ResponseStoreSampleDTO responseStoreSampleDTO = new ResponseStoreSampleDTO(storeDAO, storageDAO, stationDAO, storagePasswordDAO);


        return responseStoreSampleDTO;

    }
}
