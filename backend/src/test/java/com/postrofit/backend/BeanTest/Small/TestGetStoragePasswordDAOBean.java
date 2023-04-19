package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStoragePasswordDAOBean;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoragePasswordDAO;
import com.postrofit.backend.Repository.StorageDAORepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetStoragePasswordDAOBean {

    @Autowired
    GetStoragePasswordDAOBean getStoragePasswordDAOBean;
    @Autowired
    StorageDAORepository storageDAORepository;

    @Test
    @DisplayName("testGetStoragePasswordDAOBean_1 테스트 : long storeId")
    void testGetStoragePasswordDAOBean_1(){
        // 아직 함수 구현 x
    }
    @Test
    @DisplayName("testGetStoragePasswordDAOBean_2 테스트 : StorageDAO storageDAO")
    void testGetStoragePasswordDAOBean_2(){
        // TODO StoragePasswordDAO를 반환
        // TODO StorageDAO의 StoragePasswordId를 가지고 찾음
        // TODO 여기서 PasswordId = 0L -> password "1234"
        StorageDAO storageDAO = storageDAORepository.findStorageDAOByStoragePasswordId(0L);

        StoragePasswordDAO storagePasswordDAO = getStoragePasswordDAOBean.exec(storageDAO);

        assertEquals(storageDAO.getStoragePasswordId(), storagePasswordDAO.getStoragePasswordId());
    }
}
