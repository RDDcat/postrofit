package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStoreProfitBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestGetStoreProfitBean {

    @Autowired
    GetStoreProfitBean getStoreProfitBean;

    @Test
    @DisplayName("testGetStoreProfitBean 테스트 : StorageBrand brand, String size")
    void testGetStoreProfitBean(){

    }
}