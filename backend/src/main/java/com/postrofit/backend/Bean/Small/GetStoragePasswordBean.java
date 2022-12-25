package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import org.springframework.stereotype.Component;

@Component
public class GetStoragePasswordBean {
    public StoragePasswordDTO exec(StorageDAO storageDAO){
        if(storageDAO ==null){
            return null;
        }
        StoragePasswordDTO storagePasswordDTO = new StoragePasswordDTO();
        storagePasswordDTO.setStationName(storageDAO.getStationDAO().getStationName());
        storagePasswordDTO.setPassword(storageDAO.getStoragePasswordDAO().getStoragePassword());
        storagePasswordDTO.setStorageNum(storageDAO.getStorageNumber());

        return storagePasswordDTO;
    }
}
