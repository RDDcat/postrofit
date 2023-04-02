package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DTO.StorageStatDTO;
import com.postrofit.backend.Model.Enum.StorageStat;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CleanStatStorageStatDTOBean {
    public List<StorageStatDTO> exec(List<StorageStatDTO> storageStatDTOS){
        for (StorageStatDTO dto:storageStatDTOS) {
            dto.setStorageStat(StorageStat.EMPTY);
        }
        return storageStatDTOS;
    }
}
