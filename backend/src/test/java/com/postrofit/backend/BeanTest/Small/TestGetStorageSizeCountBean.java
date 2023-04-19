package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStorageSizeCountBean;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.StorageStationStatDTO;
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
public class TestGetStorageSizeCountBean {

    @Autowired
    GetStorageSizeCountBean getStorageSizeCountBean;
    @Autowired
    StorageDAORepository storageDAORepository;

    @Test
    @DisplayName("testGetStorageSizeCountBean 테스트 : StorageDAO storageDAO, StorageStationStatDTO storageStationStatDTO")
    void testGetStorageSizeCountBean(){
        // storageId 0L -> small 크기
        StorageDAO storageDAO = storageDAORepository.findStorageDAOByStorageId(0L);
        // 0으로 초기화
        StorageStationStatDTO storageStationStatDTO = new StorageStationStatDTO();

        // 빈이 동작하면 small이 1이 되어야 함
        getStorageSizeCountBean.exec(storageDAO, storageStationStatDTO);

        assertEquals(1, storageStationStatDTO.getStorageSmall());
    }
}
