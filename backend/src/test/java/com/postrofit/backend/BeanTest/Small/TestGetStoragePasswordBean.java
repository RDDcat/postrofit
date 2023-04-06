package com.postrofit.backend.BeanTest.Small;

import com.netflix.discovery.converters.Auto;
import com.postrofit.backend.Bean.Small.GetStoragePasswordBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestGetStoragePasswordBean {

    @Autowired
    GetStoragePasswordBean getStoragePasswordBean;

    @Test
    @DisplayName("testGetStoragePasswordBean 테스트 : StorageDAO storageDAO")
    void testGetStoragePasswordBean(){

    }
}
