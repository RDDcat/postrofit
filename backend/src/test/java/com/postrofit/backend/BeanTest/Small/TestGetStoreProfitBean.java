package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStoreProfitBean;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.StoreProfitDTO;
import com.postrofit.backend.Model.Enum.StorageBrand;
import com.postrofit.backend.Model.Enum.StorageSize;
import com.postrofit.backend.Repository.StationDAORepository;
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
public class TestGetStoreProfitBean {

    @Autowired
    GetStoreProfitBean getStoreProfitBean;
    @Autowired
    StationDAORepository stationDAORepository;
    @Autowired
    StorageDAORepository storageDAORepository;

    @Test
    @DisplayName("testGetStoreProfitBean 테스트 : StorageBrand brand, StorageSize size")
    void testGetStoreProfitBean(){
        StorageBrand brand = StorageBrand.SAENU;
        StorageSize size = StorageSize.SMALL;

        // TODO SAENU에 SMALL이면 가격 2000
        StoreProfitDTO storeProfitDTO = getStoreProfitBean.exec(brand, size);

        assertEquals(2000, storeProfitDTO.getProfit());
    }
    @Test
    @DisplayName("testGetStoreProfitBean_1 테스트 : StationDAO stationDAO, StorageDAO storageDAO")
    void testGetStoreProfitBean_1() {
        // "테스트역1" StationDAO, "테스트역1"에 있는 보관함 StorageDAO 크기 MID
        StationDAO stationDAO = stationDAORepository.findByStationName("테스트역1");
        StorageDAO storageDAO = storageDAORepository.findStorageDAOByStorageId(21L);

        StoreProfitDTO storeProfitDTO = getStoreProfitBean.exec(stationDAO, storageDAO);

        assertEquals(3000, storeProfitDTO.getProfit());
    }
}
