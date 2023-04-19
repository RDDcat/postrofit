package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetUserDAOBean;
import com.postrofit.backend.Model.DAO.UserDAO;
import com.postrofit.backend.Model.DTO.RequestMakeOrderDTO;
import com.postrofit.backend.Model.DTO.RequestStoreDTO;
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
        // userId -> "마로아님"
        long userId = 0L;

        UserDAO userDAO = getUserDAOBean.exec(userId);

        assertEquals(userId, userDAO.getUserId());
    }
    @Test
    @DisplayName("testGetUserDAOBean_2 테스트 : RequestMakeOrderDTO requestMakeOrderDTO")
    void testGetUserDAOBean_2(){
        RequestMakeOrderDTO requestMakeOrderDTO = new RequestMakeOrderDTO();
        requestMakeOrderDTO.setUserId(0L);

        UserDAO userDAO = getUserDAOBean.exec(requestMakeOrderDTO);

        assertEquals(requestMakeOrderDTO.getUserId(), userDAO.getUserId());
    }
    @Test
    @DisplayName("testGetUserDAOBean_3 테스트 : RequestStoreDTO requestStoreDTO")
    void testGetUserDAOBean_3(){
        RequestStoreDTO requestStoreDTO = new RequestStoreDTO();
        requestStoreDTO.setUserId(0L);

        UserDAO userDAO = getUserDAOBean.exec(requestStoreDTO);

        assertEquals(requestStoreDTO.getUserId(), userDAO.getUserId());
    }
}
