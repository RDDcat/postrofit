package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStorageSizeCountBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestGetStorageSizeCountBean {

    @Autowired
    GetStorageSizeCountBean getStorageSizeCountBean;

    @Test
    @DisplayName("testGetStorageSizeCountBean 테스트 : StorageDAO storageDAO, StorageStationStatDTO storageStationStatDTO")
    void testGetStorageSizeCountBean(){

    }
}
