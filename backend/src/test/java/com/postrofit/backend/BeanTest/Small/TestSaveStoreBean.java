package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.SaveStoreBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestSaveStoreBean {

    @Autowired
    SaveStoreBean saveStoreBean;

    @Test
    @DisplayName("testSaveStoreBean 테스트 : StoreDAO storeDAO")
    void testSaveStoreBean(){

    }
}
