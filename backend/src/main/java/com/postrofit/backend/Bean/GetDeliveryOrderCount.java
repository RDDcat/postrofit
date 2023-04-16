package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetDeliveryCountDTO;
import com.postrofit.backend.Bean.Small.GetOrderDAOsBean;
import com.postrofit.backend.Bean.Small.GetStationDAOBean;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DTO.DeliveryCountDTO;
import com.postrofit.backend.Model.DTO.RequestStartEndDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetDeliveryOrderCount {
    @Autowired
    GetStationDAOBean getStationDAOBean;
    @Autowired
    GetOrderDAOsBean getOrderDAOsBean;
    @Autowired
    GetDeliveryCountDTO getDeliveryCountDTO;


    public DeliveryCountDTO exec(RequestStartEndDTO requestStartEndDTO) {
        StationDAO startStationDAO = getStationDAOBean.exec(requestStartEndDTO.getStart());
        StationDAO endStationDAO = getStationDAOBean.exec(requestStartEndDTO.getEnd());

        List<OrderDAO> orderDAOS = getOrderDAOsBean.exec(startStationDAO, endStationDAO);

        DeliveryCountDTO deliveryCountDTO = getDeliveryCountDTO.exec(orderDAOS);

        return deliveryCountDTO;
    }
}
