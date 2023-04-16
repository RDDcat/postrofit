package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStationStorageStatBean;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.StorageStationStatDTO;
import com.postrofit.backend.Repository.StorageDAORepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetStationStorageStatBean {

    @Autowired
    GetStationStorageStatBean getStationStorageStatBean;
    @Autowired
    StorageDAORepository storageDAORepository;

    // TODO 시작역의 List<StorageDAO>를 받아서 StorageStationStatDTO(역의 보관함 개수(소,중,대) 가져오기
    @Test
    @DisplayName("testGetStationStorageStatBean 테스트 : List<StorageDAO> start")
    void testGetStationStorageStatBean(){
        // "테스트역1" 역 id = 0L
        List<StorageDAO> start = storageDAORepository.findStorageDAOByStationId(0);

        StorageStationStatDTO storageStationStatDTO = getStationStorageStatBean.exec(start);

        // "테스트역1"에는 small, mid, big 1개씩 있다.
        assertEquals(1, storageStationStatDTO.getStorageSmall());
    }
}
