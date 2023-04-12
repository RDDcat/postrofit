package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.*;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoragePasswordDAO;
import com.postrofit.backend.Model.DTO.StorageDetailDTO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetUserStoreDetailBean {
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    @Autowired
    GetStorageStatDTOBean getStorageStatDTOBean;
    @Autowired
    GetStationDAOBean getStationDAOBean;
    @Autowired
    GetStoragePasswordDAOBean getStoragePasswordDAOBean;

    public StorageDetailDTO exec(long storageId){
        StorageDAO storageDAO = getStorageDAOBean.exec(storageId);
        StationDAO stationDAO = getStationDAOBean.exec(storageDAO);
        StoragePasswordDAO storagePasswordDAO = getStoragePasswordDAOBean.exec(storageDAO);


        StorageStatDTO storageStatDTO = getStorageStatDTOBean.exec(storageDAO);

        StoragePasswordDTO storagePasswordDTO = new StoragePasswordDTO();
        storagePasswordDTO.setStoragePasswordDTO(stationDAO, storageDAO, storagePasswordDAO);

        StorageDetailDTO storageDetailDTO = new StorageDetailDTO();
        storageDetailDTO.setStorageDetailDTO(storageStatDTO, storagePasswordDTO);


        return storageDetailDTO;
    }
}
