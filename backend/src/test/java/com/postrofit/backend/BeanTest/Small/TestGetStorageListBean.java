package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.legacy.GetStorageListBean;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Repository.StationDAORepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetStorageListBean {

    @Autowired
    GetStorageListBean getStorageListBean;
    @Autowired
    StationDAORepository stationDAORepository;

    @Test
    @DisplayName("testGetStorageListBean 테스트 : StationDAO stationDAO")
    void testGetStorageListBean(){
        StationDAO stationDAO = stationDAORepository.findByStationName("테스트역1");

        List<StorageDAO> storageDAOList = getStorageListBean.exec(stationDAO);

        assertEquals(stationDAO.getStationId(), storageDAOList.get(0).getStationId());
    }
}
