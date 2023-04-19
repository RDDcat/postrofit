package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStorageStatDTOsBean;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
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
public class TestGetStorageStatDTOsBean {

    @Autowired
    GetStorageStatDTOsBean getStorageStatDTOsBean;
    @Autowired
    StorageDAORepository storageDAORepository;

    @Test
    @DisplayName("testGetStorageStatDTOBean 테스트 : List<StorageDAO> start")
    void testGetStorageStatDTOBean(){
        // StationId = 0 -> "테스트역0"
        List<StorageDAO> storageDAOList = storageDAORepository.findStorageDAOByStationId(0L);

        List<StorageStatDTO> storageStatDTOS = getStorageStatDTOsBean.exec(storageDAOList);

        assertEquals(storageDAOList.get(0).getStorageId(), storageStatDTOS.get(0).getStorageId());
        assertEquals(storageDAOList.size(), storageStatDTOS.size());
    }

}
