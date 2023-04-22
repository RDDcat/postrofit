package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import com.postrofit.backend.Model.Enum.StorageStat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class SetStorageStatDTOByOrderBean {
    public List<StorageStatDTO> exec(List<StorageStatDTO> storageStatDTOS, OrderDAO orderDAO){
        boolean isDataExist = false;

        for (StorageStatDTO dto:storageStatDTOS) {
            if(orderDAO.getStorageId() == dto.getStorageId()){
                dto.setStorageStat(StorageStat.WAIT);
                isDataExist = true;
            }
        }
        if(isDataExist){
            return storageStatDTOS;
        }
        log.error("역과 스토리지 데이터 부정합..");
        return storageStatDTOS;
    }

    public List<StorageStatDTO> exec(List<StorageStatDTO> storageStatDTOS, StorageStatDTO storageStatDTO) {

        for (StorageStatDTO dto:storageStatDTOS) {
            if(storageStatDTO.getStorageId() == dto.getStorageId()){
                continue;
            }
            dto.setStorageStat(StorageStat.EMPTY);
        }

        return storageStatDTOS;
    }
}
