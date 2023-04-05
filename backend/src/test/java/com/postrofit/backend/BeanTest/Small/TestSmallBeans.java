package com.postrofit.backend.BeanTest.Small;

import com.netflix.discovery.converters.Auto;
import com.postrofit.backend.Bean.Small.*;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestSmallBeans {

    @Autowired
    GetOrderDAOBean getOrderDAOBean;


    @Test
    @DisplayName("testGetOrderDAOBean 테스트 : UserDAO")
    void testGetOrderDAOBean_1(){
        UserDAO userDAO = new UserDAO();  // input output 생성
        OrderDAO expect = new OrderDAO();

        OrderDAO orderDAO = getOrderDAOBean.exec(userDAO);   // bean 통과

        assertEquals(expect, orderDAO); // 검증 
    }

    @Test
    @DisplayName("testGetOrderDAOBean 테스트 : String start, String end, String userId")
    void testGetOrderDAOBean_2(){
        String start = "";
        String end = "";
        String userId = "";
        OrderDAO expect = new OrderDAO();

        OrderDAO orderDAO = getOrderDAOBean.exec(start, end, userId);

        assertEquals(expect, orderDAO);
    }
}
