package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStoragePasswordDAOBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetStoragePasswordDAOBean {

    @Autowired
    GetStoragePasswordDAOBean getStoragePasswordDAOBean;

    @Test
    @DisplayName("testGetStoragePasswordDAOBean_1 테스트 : long storeId")
    void testGetStoragePasswordDAOBean_1(){

    }
    @Test
    @DisplayName("testGetStoragePasswordDAOBean_2 테스트 : StorageDAO storageDAO")
    void testGetStoragePasswordDAOBean_2(){

    }
}
