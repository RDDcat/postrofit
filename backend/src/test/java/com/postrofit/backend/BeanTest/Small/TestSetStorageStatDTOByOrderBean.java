package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.SetStorageStatDTOByOrderBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestSetStorageStatDTOByOrderBean {

    @Autowired
    SetStorageStatDTOByOrderBean setStorageStatDTOByOrderBean;

    @Test
    @DisplayName("testSetStorageStatDTOByOrderBean 테스트 : List<StorageStatDTO> storageStatDTOS, OrderDAO orderDAO")
    void testSetStorageStatDTOByOrderBean(){

    }
}
