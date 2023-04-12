package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.CreateDeliveryBean;
import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.Enum.OrderStat;
import com.postrofit.backend.Repository.DeliveryDAORepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCreateDeliveryBean {

    @Autowired
    CreateDeliveryBean createDeliveryBean;
    @Autowired
    DeliveryDAORepository deliveryRepository;

    @Test
    @Transactional
    @DisplayName("testCreateDeliveryBean 테스트 : OrderDAO orderDAO, long userId")
    void testCreateDeliveryBean(){

        OrderDAO orderDAO = new OrderDAO(
                1,
                1,
                1,
                1,
                1,
                2,
                LocalDateTime.now(),
                OrderStat.WAIT);
        long userId = 10L;

        createDeliveryBean.exec(orderDAO, userId);
        DeliveryDAO deliveryDAO = deliveryRepository.findDeliveryDAOByUserId(userId);
        long saveUserId = deliveryDAO.getUserId();

        assertEquals(userId ,saveUserId);


    }
}
