package com.postrofit.backend.BeanTest.Small;

import com.netflix.discovery.converters.Auto;
import com.postrofit.backend.Bean.Small.CreateDeliveryBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestCreateDeliveryBean {

    @Autowired
    CreateDeliveryBean createDeliveryBean;

    @Test
    @DisplayName("testCreateDeliveryBean 테스트 : OrderDAO orderDAO, long userId")
    void testCreateDeliveryBean(){

    }
}
