package com.postrofit.backend.BeanTest.Small;

import com.netflix.discovery.converters.Auto;
import com.postrofit.backend.Bean.Small.GetDeliveryDAOBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestGetDeliveryDAOBean {

    @Autowired
    GetDeliveryDAOBean getDeliveryDAOBean;

    @Test
    @DisplayName("testGetDeliveryDAOBean 테스트 : long userId")
    void testGetDeliveryDAOBean(){

    }
}
