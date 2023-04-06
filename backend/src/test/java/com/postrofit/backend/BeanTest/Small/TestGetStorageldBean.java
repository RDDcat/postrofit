package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStorageIdBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestGetStorageldBean {

    @Autowired
    GetStorageIdBean getStorageIdBean;

    @Test
    @DisplayName("testGetStorageldBean 테스트 : String stationName, int storageNum")
    void testGetStorageldBean(){

    }
}
