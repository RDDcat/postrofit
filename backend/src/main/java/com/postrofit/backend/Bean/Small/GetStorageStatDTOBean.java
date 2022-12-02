package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetStorageStatDTOBean {
    public List<StorageStatDTO> exec(List<StorageDAO> start){
        List<StorageStatDTO> storageStatDTOS = new ArrayList<>();
        StorageStatDTO storageStatDTO = new StorageStatDTO();
        for(StorageDAO storage : start){
            storageStatDTO.setStorageNumber(storage.getStorageNumber());
            storageStatDTO.setStorageStat(storage.getStorageStat());
            storageStatDTOS.add(storageStatDTO);
        }
        return storageStatDTOS;
    }
}
