package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import com.postrofit.backend.Repository.OrderDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetOrderDAOsBean {
    @Autowired
    OrderDAORepository orderDAORepository;
    public List<OrderDAO> exec(UserDAO userDAO){
        List<OrderDAO> orderDAO = orderDAORepository.findOrderDAOsByUserId(userDAO.getUserId());

        return orderDAO;

    }
}
