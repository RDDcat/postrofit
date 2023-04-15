package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStationDAOBean;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.Enum.StorageSize;
import com.postrofit.backend.Model.Enum.StorageStat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetStationDAOBean {

    @Autowired
    GetStationDAOBean getStationDAOBean;

    @Test
    @DisplayName("testGetStationDAOBean_1 테스트 : String name")
    void testGetStationDAOBean_1(){
        String name = "테스트역1";

        StationDAO stationDAO = getStationDAOBean.exec(name);

        assertEquals(name, stationDAO.getStationName());
    }
    @Test
    @DisplayName("testGetStationDAOBean_2 테스트 : long stationId")
    void testGetStationDAOBean_2(){
        long stationId = 1L;

        StationDAO stationDAO = getStationDAOBean.exec(stationId);

        assertEquals(stationId, stationDAO.getStationId());
    }
    @Test
    @DisplayName("testGetStationDAOBean_3 테스트 : StorageDAO storageDAO")
    void testGetStationDAOBean_3(){
        Date date = new Date();
        StorageDAO storageDAO = new StorageDAO();

        StationDAO stationDAO = getStationDAOBean.exec(storageDAO);

        assertEquals(storageDAO.getStationId(), stationDAO.getStationId());
    }
    @Test
    @DisplayName("testGetStationDAOBean_4 테스트 : RequestMakeOrderDTO requestMakeOrderDTO")
    void testGetStationDAOBean_4(){

    }
}
