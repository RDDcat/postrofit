package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetUserDAOBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetUserDAOBean {

    @Autowired
    GetUserDAOBean getUserDAOBean;

    @Test
    @DisplayName("testGetUserDAOBean_1 테스트 : long userId")
    void testGetUserDAOBean_1(){

    }
    @Test
    @DisplayName("testGetUserDAOBean_2 테스트 : RequestMakeOrderDTO requestMakeOrderDTO")
    void testGetUserDAOBean_2(){

    }
    @Test
    @DisplayName("testGetUserDAOBean_3 테스트 : RequestStoreDTO requestStoreDTO")
    void testGetUserDAOBean_3(){

    }
}
