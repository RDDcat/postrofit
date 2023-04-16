package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetStationDAOBean;
import com.postrofit.backend.Bean.Small.GetStorageDAOBean;
import com.postrofit.backend.Bean.Small.GetStoragePasswordBean;
import com.postrofit.backend.Bean.Small.GetStoragePasswordDAOBean;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoragePasswordDAO;
import com.postrofit.backend.Model.DTO.RequestStartStoragePasswordDTO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetStartStoragePassword {
    @Autowired
    GetStationDAOBean getStationDAOBean;
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    @Autowired
    GetStoragePasswordDAOBean getStoragePasswordDAOBean;

    public StoragePasswordDTO exec(RequestStartStoragePasswordDTO requestStartStoragePasswordDTO) {
        StationDAO stationDAO = getStationDAOBean.exec(requestStartStoragePasswordDTO);
        StorageDAO storageDAO = getStorageDAOBean.exec(stationDAO, requestStartStoragePasswordDTO);
        StoragePasswordDAO storagePasswordDAO = getStoragePasswordDAOBean.exec(storageDAO);

        StoragePasswordDTO storagePasswordDTO = new StoragePasswordDTO();
        storagePasswordDTO.setStoragePasswordDTO(stationDAO, storageDAO, storagePasswordDAO);

        return storagePasswordDTO;
    }
}
