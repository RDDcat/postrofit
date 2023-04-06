package com.postrofit.backend.BeanTest.Small;

import com.netflix.discovery.converters.Auto;
import com.postrofit.backend.Bean.Small.GetStationIdBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestGetStationIdBean {

    @Autowired
    GetStationIdBean getStationIdBean;

    @Test
    @DisplayName("testGetStationIdBean 테스트 : String stationName")
    void testGetStationIdBean(){

    }
}
