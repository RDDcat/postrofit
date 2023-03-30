package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Repository.DeliveryDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateDeliveryBean {
    @Autowired
    DeliveryDAORepository deliveryRepository;

    public void exec(OrderDAO orderDAO, long userId){
        DeliveryDAO deliveryDAO = new DeliveryDAO();
        deliveryDAO.makeDelivery(orderDAO, userId);

        // TODO 잘 저장됐는지 확인하는 코드 추가해야함
        deliveryRepository.save(deliveryDAO);
    }
}
