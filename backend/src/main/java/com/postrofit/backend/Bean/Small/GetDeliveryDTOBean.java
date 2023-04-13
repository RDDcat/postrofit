package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DTO.History.DeliveryDTO;
import com.postrofit.backend.Model.DTO.History.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetDeliveryDTOBean {
    @Autowired
    GetStationDAOBean getStationDAOBean;
    @Autowired
    GetOrderDAOBean getOrderDAOBean;

    public DeliveryDTO exec(DeliveryDAO deliveryDAO) {
        OrderDAO orderDAO = getOrderDAOBean.exec(deliveryDAO);

        StationDAO startStationDAO = getStationDAOBean.exec(orderDAO.getStartStationId());
        StationDAO endStationDAO = getStationDAOBean.exec(orderDAO.getEndStationId());

        DeliveryDTO deliveryDTO = new DeliveryDTO();

        deliveryDTO.setStartStationName(startStationDAO.getStationName());
        deliveryDTO.setEndStationName(endStationDAO.getStationName());
        if(deliveryDAO.getPrice() == 0){
            deliveryDTO.setPrice(2000);
        }else {
            deliveryDTO.setPrice(deliveryDAO.getPrice());
        }
        deliveryDTO.setCreateAt(deliveryDAO.getCreateAt());
        if(deliveryDAO.getFinishedAt()!= null){
            deliveryDTO.setFinishedAt(deliveryDAO.getFinishedAt());
        }
        deliveryDTO.setOrderStat(orderDAO.getOrderStat());

        return deliveryDTO;

    }
}
