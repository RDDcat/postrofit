package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Repository.DeliveryDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetDeliveryDAOBean {
    @Autowired
    DeliveryDAORepository deliveryDAORepository;

    public DeliveryDAO exec(long userId) {
        // null 예외처리 해줘야함
        return deliveryDAORepository.findDeliveryDAOByUserId(userId);
    }
}
