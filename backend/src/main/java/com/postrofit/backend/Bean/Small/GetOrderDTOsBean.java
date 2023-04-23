package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.History.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetOrderDTOsBean {
    @Autowired
    GetOrderDTOBean getOrderDTOBean;


    public List<OrderDTO> exec(List<OrderDAO> orderDAOS) {
        List<OrderDTO> orderDTOS = new ArrayList<>();
        for (OrderDAO orderDAO:orderDAOS) {
            orderDTOS.add(getOrderDTOBean.exec(orderDAO));
        }

        return orderDTOS;
    }
}
