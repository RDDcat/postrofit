package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetWaitingOrderBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestGetWaitingOrderBean {

    @Autowired
    GetWaitingOrderBean getWaitingOrderBean;

    @Test
    @DisplayName("testGetWaitingOrderBean 테스트 : StationDAO start, StationDAO end")
    void testGetWaitingOrderBean(){

    }
}
