package com.postrofit.backend.Model.DTO;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.Enum.StorageSize;
import lombok.Data;

@Data
public class ResponseDeliveryOrderStorageDTO {
    long orderId;
    StorageSize size;
    int price;
    int storageNum;

    public ResponseDeliveryOrderStorageDTO(OrderDAO orderDAO, StorageDAO storageDAO){
        this.orderId = orderDAO.getOrderId();
        this.size = storageDAO.getStorageSize();
        this.storageNum = storageDAO.getStorageNumber();
    }
}
