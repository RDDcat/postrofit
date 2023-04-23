package com.postrofit.backend.Model.DTO.History;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Model.DTO.StoreProfitDTO;
import com.postrofit.backend.Model.Enum.StorageSize;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class StoreDTO implements HistoryDTO {
    String stationName;
    long storeId;
    long storageId;
    int price;
    StorageSize storageSize;
    Timestamp timestamp;

    public StoreDTO (StationDAO stationDAO, StoreDAO storeDAO, StoreProfitDTO storeProfitDTO){
        this.stationName = stationDAO.getStationName();
        this.storeId = storeDAO.getStoreId();
        this.storageId = storeDAO.getStorageId();
        this.price = storeProfitDTO.getProfit();
        this.storageSize = storeProfitDTO.getStorageSize();
        this.timestamp = storeDAO.getCreateAt();
    }
}
