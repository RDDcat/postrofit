package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetDeliveryCost;
import com.postrofit.backend.Bean.Small.GetOrderDAOBean;
import com.postrofit.backend.Bean.Small.GetStorageDAOBean;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.ResponseDeliveryOrderStorageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetOrderStorageInfo {
    @Autowired
    GetOrderDAOBean getOrderDAOBean;
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    @Autowired
    GetDeliveryCost getDeliveryCost;
    public ResponseDeliveryOrderStorageDTO exec(long storageId) {
        OrderDAO orderDAO = getOrderDAOBean.exec(storageId);
        StorageDAO storageDAO = getStorageDAOBean.exec(storageId);
        int cost = getDeliveryCost.exec(storageDAO);

        ResponseDeliveryOrderStorageDTO responseDeliveryOrderStorageDTO = new ResponseDeliveryOrderStorageDTO(orderDAO, storageDAO);
        responseDeliveryOrderStorageDTO.setPrice(cost);

        return responseDeliveryOrderStorageDTO;

    }
}
