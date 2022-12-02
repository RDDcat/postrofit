package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.storageDAO;
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

    public StorageStationStatDTO exec(List<storageDAO> start){
        List<StorageStatDTO> storageStatDTOS = new ArrayList<>();
        StorageStationStatDTO storageStationStatDTO = new StorageStationStatDTO();
        StorageStatDTO storageStatDTO = new StorageStatDTO();

        for(storageDAO storage : start){
            storageStatDTO.setStorageNumber(storage.getStorageNumber());
            storageStatDTO.setStorageStat(storage.getStorageStat());
            storageStatDTOS.add(storageStatDTO);
            getStorageSizeCountBean.exec(storage, storageStationStatDTO);
        }
        storageStationStatDTO.setStorageStatDTOList(storageStatDTOS);

        return storageStationStatDTO;
    }
}
