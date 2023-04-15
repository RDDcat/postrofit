package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetOrderDAOBean;
import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetOrderDAOBean {

    @Autowired
    GetOrderDAOBean getOrderDAOBean;


    @Test
    @DisplayName("testGetOrderDAOBean 테스트 : String start, String end, String userId")
    void testGetOrderDAOBean_1(){
        // 값 넣어줘야함
        String start = "";
        String end = "";
        String userId = "";
        OrderDAO expect = new OrderDAO();

        OrderDAO orderDAO = getOrderDAOBean.exec(start, end, userId);

        assertEquals(expect, orderDAO);
    }
    @Test
    @DisplayName("testGetOrderDAOBean 테스트 : UserDAO")
    void testGetOrderDAOBean_2() {
        UserDAO userDAO = new UserDAO();  // input output 생성
        OrderDAO expect = new OrderDAO();

        OrderDAO orderDAO = getOrderDAOBean.exec(userDAO);   // bean 통과

        assertEquals(expect, orderDAO); // 검증
    }
    @Test
    @DisplayName("testGetOrderDAOBean_3 테스트 : RequestTakeOrderDTO requestTakeOrderDTO")
    void testGetOrderDAOBean_3(){

    }
    @Test
    @DisplayName("testGetOrderDAOBean_4 테스트 : DeliveryDAO deliveryDAO")
    void testGetOrderDAOBean_4(){
        DeliveryDAO deliveryDAO = new DeliveryDAO();
        OrderDAO expect = new OrderDAO();

        OrderDAO orderDAO = getOrderDAOBean.exec(deliveryDAO);

        assertEquals(expect, orderDAO);
    }
    @Test
    @DisplayName("testGetOrderDAOBean_5 테스트 : RequestHistoryDetailDTO requestHistoryDetailDTO")
    void testGetOrderDAOBean_5(){

    }
}
