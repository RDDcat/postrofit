package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetStationDAOBean;
import com.postrofit.backend.Bean.Small.GetStorageDAOBean;
import com.postrofit.backend.Bean.Small.GetStoreDAOBean;
import com.postrofit.backend.Bean.Small.GetUserDAOBean;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
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

    public ResponseStoreSampleDTO exec(long storeId) {
        StoreDAO storeDAO = getStoreDAOBean.exec(storeId);

        // store id 로 storage, station 조회
        StorageDAO storageDAO = getStorageDAOBean.exec(storeDAO);
        StationDAO stationDAO = getStationDAOBean.exec(storageDAO);

        // mapping
        ResponseStoreSampleDTO responseStoreSampleDTO = new ResponseStoreSampleDTO(storeDAO, storageDAO, stationDAO);


        return responseStoreSampleDTO;

    }
}
