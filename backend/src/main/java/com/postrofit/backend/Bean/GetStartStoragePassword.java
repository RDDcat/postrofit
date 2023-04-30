package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.*;
import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoragePasswordDAO;
import com.postrofit.backend.Model.DTO.RequestDeliveryStoragePasswordDTO;
import com.postrofit.backend.Model.DTO.RequestStartStoragePasswordDTO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetStartStoragePassword {
    @Autowired
    GetDeliveryDAOBean getDeliveryDAOBean;
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

    public StoragePasswordDTO exec(RequestDeliveryStoragePasswordDTO requestStartStoragePasswordDTO) {
        DeliveryDAO deliveryDAO = getDeliveryDAOBean.exec(requestStartStoragePasswordDTO);
        StorageDAO storageDAO = getStorageDAOBean.exec(deliveryDAO);
        StationDAO stationDAO = getStationDAOBean.exec(storageDAO);
        StoragePasswordDAO storagePasswordDAO = getStoragePasswordDAOBean.exec(storageDAO);

        StoragePasswordDTO storagePasswordDTO = new StoragePasswordDTO();
        storagePasswordDTO.setStoragePasswordDTO(stationDAO, storageDAO, storagePasswordDAO);

        return storagePasswordDTO;
    }
}
