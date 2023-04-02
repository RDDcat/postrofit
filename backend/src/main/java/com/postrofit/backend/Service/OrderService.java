package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.MakeOrderGETBean;
import com.postrofit.backend.Bean.MakeOrderBean;
import com.postrofit.backend.Bean.StorageStatBean;
import com.postrofit.backend.Bean.Order2Bean;
import com.postrofit.backend.Bean.Order3Bean;
import com.postrofit.backend.Model.DTO.OrderCostDTO;
import com.postrofit.backend.Model.DTO.RequestMakeOrderDTO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
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

    public void makeOrderPOST(RequestMakeOrderDTO requestMakeOrderDTO) {
        makeOrderBean.exec(requestMakeOrderDTO);

    }
}
