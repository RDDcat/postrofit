package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.OrderDAO;
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

    public OrderDAO exec(long userId){
        Optional<OrderDAO> orderDAO = orderDAORepository.findById(userId);

        return orderDAO.orElse(null);

    }
}
