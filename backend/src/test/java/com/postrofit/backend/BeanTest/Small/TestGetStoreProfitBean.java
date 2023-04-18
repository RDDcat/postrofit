package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStoreProfitBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetStoreProfitBean {

    @Autowired
    GetStoreProfitBean getStoreProfitBean;

    @Test
    @DisplayName("testGetStoreProfitBean 테스트 : StorageBrand brand, String size")
    void testGetStoreProfitBean(){

    }
}
