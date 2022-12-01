package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.storageDAO;
import com.postrofit.backend.Model.DTO.StationStorageStatDTO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetStationStorageStatBean {
    @Autowired
    GetStorageSizeCountBean getStorageSizeCountBean;

    public StationStorageStatDTO exec(List<storageDAO> start){
        List<StorageStatDTO> storageStatDTOS = new ArrayList<>();
        StationStorageStatDTO stationStorageStatDTO = new StationStorageStatDTO();
        StorageStatDTO storageStatDTO = new StorageStatDTO();

        for(storageDAO storage : start){
            storageStatDTO.setStorageNumber(storage.getStorageNumber());
            storageStatDTO.setStorageStat(storage.getStorageStat());
            storageStatDTOS.add(storageStatDTO);
            getStorageSizeCountBean.exec(storage, stationStorageStatDTO);
        }
        stationStorageStatDTO.setStorageStatDTOList(storageStatDTOS);

        return stationStorageStatDTO;
    }
}
