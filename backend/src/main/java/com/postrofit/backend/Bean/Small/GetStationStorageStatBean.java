package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.StorageStationStatDTO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetStationStorageStatBean {
    @Autowired
    GetStorageSizeCountBean getStorageSizeCountBean;

    public StorageStationStatDTO exec(List<StorageDAO> start){
        List<StorageStatDTO> storageStatDTOS = new ArrayList<>();
        StorageStationStatDTO storageStationStatDTO = new StorageStationStatDTO();
        StorageStatDTO storageStatDTO = new StorageStatDTO();

        for(StorageDAO storage : start){
            storageStatDTO.setStorageNumber(storage.getStorageNumber());
            storageStatDTO.setStorageStat(storage.getStorageStat());
            storageStatDTOS.add(storageStatDTO);
            getStorageSizeCountBean.exec(storage, storageStationStatDTO);
        }
        storageStationStatDTO.setStorageStatDTOList(storageStatDTOS);

        return storageStationStatDTO;
    }
}
