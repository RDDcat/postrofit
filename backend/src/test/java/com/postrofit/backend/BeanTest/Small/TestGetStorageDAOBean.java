package com.postrofit.backend.BeanTest.Small;

import com.netflix.discovery.converters.Auto;
import com.postrofit.backend.Bean.Small.GetStorageDAOBean;
import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Model.DTO.RequestMakeOrderDTO;
import com.postrofit.backend.Model.DTO.RequestStoreDTO;
import com.postrofit.backend.Repository.DeliveryDAORepository;
import com.postrofit.backend.Repository.OrderDAORepository;
import com.postrofit.backend.Repository.StoreDAORepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetStorageDAOBean {

    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    @Autowired
    OrderDAORepository orderDAORepository;
    @Autowired
    StoreDAORepository storeDAORepository;
    @Autowired
    DeliveryDAORepository deliveryDAORepository;


    @Test
    @DisplayName("testGetStorageDAOBean_0 테스트 : long storageId")
    void testGetStorageDAOBean_0(){
        // TODO storageId (보관함 아이디)를 가지고 StorageDAO 가져오기
        long storageId = 0L;

        StorageDAO storageDAO = getStorageDAOBean.exec(storageId);

        assertEquals(storageId, storageDAO.getStorageId());
    }
    @Test
    @DisplayName("testGetStorageDAOBean_1 테스트 : OrderDAO order")
    void testGetStorageDAOBean_1(){
        // TODO 실제 있는 데이터 가져와야 함
        OrderDAO orderDAO = orderDAORepository.findOrderDAOBystorageId(0L);

        StorageDAO storageDAO = getStorageDAOBean.exec(orderDAO);

        assertEquals(orderDAO.getStorageId(), storageDAO.getStorageId());
    }
    @Test
    @DisplayName("testGetStorageDAOBean_2 테스트 : StoreDAO storeDAO")
    void testGetStorageDAOBean_2(){
        // TODO 실제 있는 데이터 가져와야 함
        StoreDAO storeDAO = storeDAORepository.findStoreDAOByStorageId(9L);

        StorageDAO storageDAO = getStorageDAOBean.exec(storeDAO);

        assertEquals(storeDAO.getStorageId(), storageDAO.getStorageId());
    }
    @Test
    @DisplayName("testGetStorageDAOBean_3 테스트 : DeliveryDAO deliveryDAO")
    void testGetStorageDAOBean_3(){
        // TODO 실제 있는 데이터 가져와야 함
        DeliveryDAO deliveryDAO = deliveryDAORepository.findDeliveryDAOByStorageId(1L);

        StorageDAO storageDAO = getStorageDAOBean.exec(deliveryDAO);

        assertEquals(deliveryDAO.getStorageId(), storageDAO.getStorageId());
    }
    @Test
    @DisplayName("testGetStorageDAOBean_4 테스트 : RequestMakeOrderDTO requestMakeOrderDTO")
    void testGetStorageDAOBean_4(){
        // 여기서는 storageId만 있으면 됨
        RequestMakeOrderDTO requestMakeOrderDTO = new RequestMakeOrderDTO();
        requestMakeOrderDTO.setStorageId(0L);

        StorageDAO storageDAO = getStorageDAOBean.exec(requestMakeOrderDTO);

        assertEquals(requestMakeOrderDTO.getStorageId(), storageDAO.getStorageId());
    }
    @Test
    @DisplayName("testGetStorageDAOBean_5 테스트 : RequestStoreDTO requestStoreDTO")
    void testGetStorageDAOBean_5(){
        RequestStoreDTO requestStoreDTO = new RequestStoreDTO();
        requestStoreDTO.setStorageId(0L);

        StorageDAO storageDAO = getStorageDAOBean.exec(requestStoreDTO);

        assertEquals(requestStoreDTO.getStorageId(), storageDAO.getStorageId());
    }
}
