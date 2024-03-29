package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.SaveOrderBean;
import com.postrofit.backend.Model.DAO.OrderDAO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestSaveOrderBean {

    @Autowired
    SaveOrderBean saveOrderBean;

    @Test
    @DisplayName("testSaveOrderBean_1 테스트 : OrderDAO order, StorageDAO storageDAO")
    void testSaveOrderBean_1(){

        // 단순한데 OrderDAO Entity 제작이 어려븜

    }
    @Test
    @DisplayName("testSaveOrderBean_2 테스트 : OrderDAO orderDAO")
    void testSaveOrderBean_2(){

    }
}
