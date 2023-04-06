package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.SaveOrderBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestSaveOrderBean {

    @Autowired
    SaveOrderBean saveOrderBean;

    @Test
    @DisplayName("testSaveOrderBean_1 테스트 : OrderDAO order, StorageDAO storageDAO")
    void testSaveOrderBean_1(){

    }
    @Test
    @DisplayName("testSaveOrderBean_2 테스트 : OrderDAO orderDAO")
    void testSaveOrderBean_2(){

    }
}
