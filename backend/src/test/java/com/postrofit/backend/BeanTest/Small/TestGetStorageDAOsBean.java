package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStorageDAOsBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestGetStorageDAOsBean {

    @Autowired
    GetStorageDAOsBean getStorageDAOsBean;

    @Test
    @DisplayName("testGetStorageDAOsBean 테스트 : List<OrderDAO> orders")
    void testGetStorageDAOsBean(){

    }
}
