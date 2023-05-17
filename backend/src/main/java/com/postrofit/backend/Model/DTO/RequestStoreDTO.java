package com.postrofit.backend.Model.DTO;

import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import lombok.Data;

@Data
public class RequestStoreDTO {
    long userId;
    long storageId;

    public RequestStoreDTO(UserDAO userDAO, StorageDAO storageDAO) {
        this.userId = userDAO.getUserId();
        this.storageId = storageDAO.getStorageId();
    }
}
