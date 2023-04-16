package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.legacy.GetStorageListBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestGetStorageListBean {

    @Autowired
    GetStorageListBean getStorageListBean;

    @Test
    @DisplayName("testGetStorageListBean 테스트 : StationDAO stationDAO")
    void testGetStorageListBean(){

    }
}
