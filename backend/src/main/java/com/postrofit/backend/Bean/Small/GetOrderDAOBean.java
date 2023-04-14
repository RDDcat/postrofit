package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import com.postrofit.backend.Model.DTO.RequestHistoryDetailDTO;
import com.postrofit.backend.Model.DTO.RequestTakeOrderDTO;
import com.postrofit.backend.Repository.OrderDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetOrderDAOBean {
    @Autowired
    OrderDAORepository orderDAORepository;

    public OrderDAO exec(String start, String end, String userId) {
        return null;
    }

    public OrderDAO exec(UserDAO userDAO){
        Optional<OrderDAO> orderDAO = orderDAORepository.findTop1OrderDAOByUserId(userDAO.getUserId());

        return orderDAO.orElse(null);

    }

    public OrderDAO exec(RequestTakeOrderDTO requestTakeOrderDTO) {
        return orderDAORepository.findById(requestTakeOrderDTO.getOrderId()).orElse(null);
    }

    public OrderDAO exec(DeliveryDAO deliveryDAO) {
        return orderDAORepository.findById(deliveryDAO.getOrderId()).orElse(null);
    }

    public OrderDAO exec(RequestHistoryDetailDTO requestHistoryDetailDTO) {
        return orderDAORepository.findById(requestHistoryDetailDTO.getOrderId()).orElse(null);
    }
}
