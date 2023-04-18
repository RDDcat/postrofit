package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStoreDAOBean;
import com.postrofit.backend.Model.DAO.StoreDAO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetStoreDAOBean {

    @Autowired
    GetStoreDAOBean getStoreDAOBean;

    @Test
    @DisplayName("testGetStoreDAOBean_0 테스트 : String userId")
    void testGetStoreDAOBean_0(){
        // 이건 왜 있는 걸까?
        String userId = "0";

        StoreDAO storeDAO = getStoreDAOBean.exec(userId);

        assertEquals(Long.parseLong(userId), storeDAO.getUserId());
    }
    @Test
    @DisplayName("testGetStoreDAOBean 테스트 : long userId")
    void testGetStoreDAOBean_1(){
        long userId = 0L;

        StoreDAO storeDAO = getStoreDAOBean.exec(userId);

        assertEquals(userId, storeDAO.getUserId());
    }
}
