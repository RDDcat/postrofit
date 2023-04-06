package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.SetStorageStatDTOByOrderBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestSetStorageStatDTOByOrderBean {

    @Autowired
    SetStorageStatDTOByOrderBean setStorageStatDTOByOrderBean;

    @Test
    @DisplayName("testSetStorageStatDTOByOrderBean 테스트 : List<StorageStatDTO> storageStatDTOS, OrderDAO orderDAO")
    void testSetStorageStatDTOByOrderBean(){

    }
}
