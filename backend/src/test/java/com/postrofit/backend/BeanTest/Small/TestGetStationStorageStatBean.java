package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStationStorageStatBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestGetStationStorageStatBean {

    @Autowired
    GetStationStorageStatBean getStationStorageStatBean;

    @Test
    @DisplayName("testGetStationStorageStatBean 테스트 : List<StorageDAO> start")
    void testGetStationStorageStatBean(){

    }
}
