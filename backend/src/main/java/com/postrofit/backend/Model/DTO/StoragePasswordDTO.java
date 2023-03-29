package com.postrofit.backend.Model.DTO;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoragePasswordDAO;
import lombok.Data;

@Data
public class StoragePasswordDTO {
    String stationName;
    int storageNum;
    String password;

    public void setStoragePasswordDTO(StationDAO stationDAO, StorageDAO storageDAO, StoragePasswordDAO storagePasswordDAO) {
        this.stationName = stationDAO.getStationName();
        this.storageNum = storageDAO.getStorageNumber();
        this.password = storagePasswordDAO.getStoragePassword();
    }
}
