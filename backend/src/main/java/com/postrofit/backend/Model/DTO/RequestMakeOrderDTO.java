package com.postrofit.backend.Model.DTO;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RequestMakeOrderDTO {
    long userId;
    long storageId;
    String endStationName;

    public RequestMakeOrderDTO(UserDAO userDAO, StorageDAO storageDAO, StationDAO stationDAO) {
        this.userId = userDAO.getUserId();
        this.storageId = storageDAO.getStorageId();
        this.endStationName = stationDAO.getStationName();
    }
}
