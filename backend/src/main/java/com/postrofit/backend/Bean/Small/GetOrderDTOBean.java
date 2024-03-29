package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.History.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetOrderDTOBean {
    @Autowired
    GetStationDAOBean getStationDAOBean;
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    public OrderDTO exec(OrderDAO orderDAO) {
        StationDAO startStationDAO = getStationDAOBean.exec(orderDAO.getStartStationId());
        StationDAO endStationDAO = getStationDAOBean.exec(orderDAO.getEndStationId());
        StorageDAO storageDAO = getStorageDAOBean.exec(orderDAO);

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId(orderDAO.getOrderId());
        orderDTO.setStartStationName(startStationDAO.getStationName());
        orderDTO.setEndStationName(endStationDAO.getStationName());
        orderDTO.setSize(storageDAO.getStorageSize());
        if(orderDTO.getPrice() == 0){
            orderDTO.setPrice(2000);
        }else {
            orderDTO.setPrice(orderDAO.getPrice());
        }
        orderDTO.setCreateAt(orderDAO.getCreateAt());
        orderDTO.setOrderStat(orderDAO.getOrderStat());

        return orderDTO;
    }
}
