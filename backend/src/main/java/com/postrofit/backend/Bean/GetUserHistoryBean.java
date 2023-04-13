package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.*;
import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import com.postrofit.backend.Model.DTO.History.DeliveryDTO;
import com.postrofit.backend.Model.DTO.History.HistoryDTO;
import com.postrofit.backend.Model.DTO.History.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetUserHistoryBean {
    @Autowired
    GetUserDAOBean getUserDAOBean;
    @Autowired
    GetOrderDAOsBean getOrderDAOsBean;
    @Autowired
    GetDeliveryDAOsBean getDeliveryDAOsBean;
    @Autowired
    MergeHistoryDTOsBeam mergeHistoryDTOsBeam;
    @Autowired
    GetOrderDTOsBean getOrderDTOsBean;
    @Autowired
    GetDeliveryDTOsBean getDeliveryDTOsBean;


    public List<HistoryDTO> exec(long userId){
        // 유저 아이디로 order, delivery 전체 조회
        UserDAO userDAO = getUserDAOBean.exec(userId);

        List<OrderDAO> orderDAOS = getOrderDAOsBean.exec(userDAO);
        List<DeliveryDAO> deliveryDAOS = getDeliveryDAOsBean.exec(userDAO);

        // DAO to DTO
        List<OrderDTO> orderDTOS = getOrderDTOsBean.exec(orderDAOS);
        List<DeliveryDTO> deliveryDTOS = getDeliveryDTOsBean.exec(deliveryDAOS);

        // 패키징
        List<HistoryDTO> historyDTOS = mergeHistoryDTOsBeam.exec(orderDTOS, deliveryDTOS);

        return historyDTOS;
    }
}
