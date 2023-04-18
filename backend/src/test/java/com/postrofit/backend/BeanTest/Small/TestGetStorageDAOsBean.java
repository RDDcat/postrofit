package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetStorageDAOBean;
import com.postrofit.backend.Bean.Small.GetStorageDAOsBean;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Repository.OrderDAORepository;
import com.postrofit.backend.Repository.StationDAORepository;
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
public class TestGetStorageDAOsBean {

    @Autowired
    GetStorageDAOsBean getStorageDAOsBean;
    @Autowired
    OrderDAORepository orderDAORepository;
    @Autowired
    StationDAORepository stationDAORepository;


    @Test
    @DisplayName("testGetStorageDAOsBean 테스트 : List<OrderDAO> orders")
    void testGetStorageDAOsBean(){
        List<OrderDAO> orders = new ArrayList<>();
        // TODO 역이 같은 보관함 init 데이터
        orders.add(orderDAORepository.findOrderDAOBystorageId(0L));
        orders.add(orderDAORepository.findOrderDAOBystorageId(3L));
        orders.add(orderDAORepository.findOrderDAOBystorageId(5L));

        List<StorageDAO> storageDAOS = getStorageDAOsBean.exec(orders);

        assertEquals(orders.get(0).getStorageId(), storageDAOS.get(0).getStorageId());
    }

    @Test
    @DisplayName("testGetStorageDAOsBean_1 테스트 : StationDAO stationDAO")
    void testGetStorageDAOsBean_1(){
        StationDAO stationDAO = stationDAORepository.findByStationName("테스트역1");

        List<StorageDAO> storageDAOS = getStorageDAOsBean.exec(stationDAO);

        assertEquals(stationDAO.getStationId(), storageDAOS.get(0).getStationId());
    }
}
