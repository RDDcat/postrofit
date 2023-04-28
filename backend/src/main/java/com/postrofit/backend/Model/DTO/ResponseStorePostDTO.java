package com.postrofit.backend.Model.DTO;

import com.postrofit.backend.Model.DAO.StoreDAO;
import lombok.Data;

@Data
public class ResponseStorePostDTO {
    long storeId;

    public ResponseStorePostDTO(StoreDAO storeDAO) {
        this.storeId = storeDAO.getStoreId();
    }
}
