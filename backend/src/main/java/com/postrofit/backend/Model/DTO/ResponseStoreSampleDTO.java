package com.postrofit.backend.Model.DTO;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoragePasswordDAO;
import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Model.Enum.StorageSize;
import lombok.Data;

@Data
public class ResponseStoreSampleDTO {
    long storeId;
    long storageId;
    int storageNumber;
    StorageSize storageSize;
    String stationName;
    String storagePassword;


    public ResponseStoreSampleDTO(StoreDAO storeDAO, StorageDAO storageDAO, StationDAO stationDAO, StoragePasswordDAO storagePasswordDAO) {
        this.storeId = storeDAO.getStoreId();
        this.storageId = storageDAO.getStorageId();
        this.storageNumber = storageDAO.getStorageNumber();
        this.storageSize = storageDAO.getStorageSize();
        this.stationName = stationDAO.getStationName();
        this.storagePassword = storagePasswordDAO.getStoragePassword();
    }
}
