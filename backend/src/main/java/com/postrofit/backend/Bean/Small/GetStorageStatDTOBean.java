package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import org.springframework.stereotype.Component;

@Component
public class GetStorageStatDTOBean {
    public StorageStatDTO exec(StorageDAO storageDAO) {
        StorageStatDTO storageStatDTO = new StorageStatDTO();
        storageStatDTO.setStorageId(storageDAO.getStorageId());
        storageStatDTO.setStorageNumber(storageDAO.getStorageNumber());
        storageStatDTO.setStorageStat(storageDAO.getStorageStat());
        storageStatDTO.setStorageSize(storageDAO.getStorageSize());
        return storageStatDTO;
    }
}
