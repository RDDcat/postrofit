package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.*;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DTO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    StorageStatBean storageStatBean;
    @Autowired
    Order2Bean order2Bean;
    @Autowired
    Order3Bean order3Bean;
    @Autowired
    MakeOrderGETBean makeOrderGETBean;
    @Autowired
    MakeOrderBean makeOrderBean;
    @Autowired
    GetEmptyOrderStorageCountBean getEmptyOrderStorageCountBean;

    public List<StorageStatDTO> order1(String start){
        return storageStatBean.exec(start);
    }
    public OrderCostDTO order2(String start, String end){
        return order2Bean.exec(start, end);
    }
    public StoragePasswordDTO order3(long userId){
        return order3Bean.exec(userId);
    }


    public void makeOrderGET(long userId, String stationName, int storageNum) {
        makeOrderGETBean.exec(userId, stationName, storageNum);
    }

    public OrderDAO makeOrderPOST(RequestMakeOrderDTO requestMakeOrderDTO) {
        return makeOrderBean.exec(requestMakeOrderDTO);

    }

    public EmptyOrderStorageCountDTO getEmptyStorageCount(String stationName) {
        return getEmptyOrderStorageCountBean.exec(stationName);
    }
}
