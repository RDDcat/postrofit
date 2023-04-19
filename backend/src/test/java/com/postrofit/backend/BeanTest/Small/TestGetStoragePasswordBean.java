package com.postrofit.backend.BeanTest.Small;

import com.netflix.discovery.converters.Auto;
import com.postrofit.backend.Bean.Small.GetStoragePasswordBean;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
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
public class TestGetStoragePasswordBean {

    @Autowired
    GetStoragePasswordBean getStoragePasswordBean;
    @Autowired
    StorageDAORepository storageDAORepository;

    @Test
    @DisplayName("testGetStoragePasswordBean 테스트 : StorageDAO storageDAO")
    void testGetStoragePasswordBean(){
        // TODO StoragePasswordDTO를 만들기 위함
        // TODO StorageDAO에서 StationDAO, StoragePasswordDAO를 만듬
        StorageDAO storageDAO = storageDAORepository.findStorageDAOByStorageId(0L);

        StoragePasswordDTO storagePasswordDTO = getStoragePasswordBean.exec(storageDAO);

        assertEquals(storageDAO.getStorageNumber(), storagePasswordDTO.getStorageNum());
    }
}
