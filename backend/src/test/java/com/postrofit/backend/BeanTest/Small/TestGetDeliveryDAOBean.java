package com.postrofit.backend.BeanTest.Small;

import com.netflix.discovery.converters.Auto;
import com.postrofit.backend.Bean.Small.GetDeliveryDAOBean;
import com.postrofit.backend.Model.DAO.DeliveryDAO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;



@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetDeliveryDAOBean {

    @Autowired
    GetDeliveryDAOBean getDeliveryDAOBean;

    @Test
    @DisplayName("testGetDeliveryDAOBean 테스트 : long userId")
    void testGetDeliveryDAOBean_1(){
        long userId = 1L;

        DeliveryDAO deliveryDAO = getDeliveryDAOBean.exec(userId);

        assertEquals(userId, deliveryDAO.getUserId());
    }

    @Test
    @DisplayName("testGetDeliveryDAOBean 테스트 : RequestHistoryDetailDTO requestHistoryDetailDTO")
    void testGetDeliveryDAOBean_2(){

    }
}
