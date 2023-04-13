package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import com.postrofit.backend.Repository.DeliveryDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetDeliveryDAOsBean {
    @Autowired
    DeliveryDAORepository deliveryDAORepository;

    public List<DeliveryDAO> exec(UserDAO userDAO) {
        List<DeliveryDAO> deliveryDAOS = deliveryDAORepository.findAllByUserId(userDAO.getUserId());

        return deliveryDAOS;
    }
}
