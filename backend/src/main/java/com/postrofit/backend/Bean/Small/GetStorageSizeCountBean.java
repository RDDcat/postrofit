package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.storageDAO;
import com.postrofit.backend.Model.DTO.StationStorageStatDTO;
import com.postrofit.backend.Model.Enum.StorageSize;
import org.springframework.stereotype.Component;

@Component
public class GetStorageSizeCountBean {
    public void exec(storageDAO storageDAO, StationStorageStatDTO stationStorageStatDTO){
        StorageSize size = storageDAO.getStorageSize();
        switch (size){
            case BIG:
                stationStorageStatDTO.setStorageBig(stationStorageStatDTO.getStorageBig()+1);
                break;
            case MID:
                stationStorageStatDTO.setStorageMid(stationStorageStatDTO.getStorageMid()+1);
                break;
            case SMALL:
                stationStorageStatDTO.setStorageSmall(stationStorageStatDTO.getStorageSmall()+1);
                break;
            default: break;
        }
    }
}
