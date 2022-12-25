package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetStorageStatDTOBean {
    public List<StorageStatDTO> exec(List<StorageDAO> start){
        if(start==null){
            return null;
        }
        List<StorageStatDTO> storageStatDTOS = new ArrayList<>();
        for(StorageDAO storage : start){
            StorageStatDTO storageStatDTO = new StorageStatDTO(); // new 연산을 이렇게 많이 해도 괜찮을까...
            storageStatDTO.setStorageNumber(storage.getStorageNumber());
            storageStatDTO.setStorageStat(storage.getStorageStat());
            storageStatDTOS.add(storageStatDTO);
        }
        return storageStatDTOS;
    }
}
