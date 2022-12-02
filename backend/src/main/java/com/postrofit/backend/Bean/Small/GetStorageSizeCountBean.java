package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.storageDAO;
import com.postrofit.backend.Model.DTO.StorageStationStatDTO;
import com.postrofit.backend.Model.Enum.StorageSize;
import org.springframework.stereotype.Component;

@Component
public class GetStorageSizeCountBean {
    public void exec(storageDAO storageDAO, StorageStationStatDTO storageStationStatDTO){
        StorageSize size = storageDAO.getStorageSize();
        switch (size){
            case BIG:
                storageStationStatDTO.setStorageBig(storageStationStatDTO.getStorageBig()+1);
                break;
            case MID:
                storageStationStatDTO.setStorageMid(storageStationStatDTO.getStorageMid()+1);
                break;
            case SMALL:
                storageStationStatDTO.setStorageSmall(storageStationStatDTO.getStorageSmall()+1);
                break;
            default:
                System.out.println("storeDAO null 값 들어옴");
                break;
        }
    }
}
