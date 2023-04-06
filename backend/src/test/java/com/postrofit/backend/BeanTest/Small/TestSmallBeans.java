package com.postrofit.backend.BeanTest.Small;

import com.netflix.discovery.converters.Auto;
import com.postrofit.backend.Bean.Small.*;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestSmallBeans {

    @Autowired
    GetOrderDAOBean getOrderDAOBean;



    @Test
    @DisplayName("testCleanStatStorageStatDTOBean 테스트 : List<StorageStatDTO> storageStatDTOS")
    void testCleanStatStorageStatDTOBean(){

    }
    @Test
    @DisplayName("testCreateDeliveryBean 테스트 : OrderDAO orderDAO, long userId")
    void testCreateDeliveryBean(){

    }
    @Test
    @DisplayName("testGetDeliveryDAOBean 테스트 : long userId")
    void testGetDeliveryDAOBean(){

    }
    @Test
    @DisplayName("testGetOrderCostDTOBean 테스트 : String start, String end")
    void testGetOrderCostDTOBean(){

    }
    @Test
    @DisplayName("testGetOrderDAOBean 테스트 : String start, String end, String userId")
    void testGetOrderDAOBean_1(){
        String start = "";
        String end = "";
        String userId = "";
        OrderDAO expect = new OrderDAO();

        OrderDAO orderDAO = getOrderDAOBean.exec(start, end, userId);

        assertEquals(expect, orderDAO);
    }
    @Test
    @DisplayName("testGetOrderDAOBean 테스트 : UserDAO")
    void testGetOrderDAOBean_2() {
        UserDAO userDAO = new UserDAO();  // input output 생성
        OrderDAO expect = new OrderDAO();

        OrderDAO orderDAO = getOrderDAOBean.exec(userDAO);   // bean 통과

        assertEquals(expect, orderDAO); // 검증
    }
    @Test
    @DisplayName("testGetOrderDAOBean_3 테스트 : RequestTakeOrderDTO requestTakeOrderDTO")
    void testGetOrderDAOBean_3(){

    }
    @Test
    @DisplayName("testGetOrderDAOBean_4 테스트 : DeliveryDAO deliveryDAO")
    void testGetOrderDAOBean_4(){

    }
    @Test
    @DisplayName("testGetOrderDAOsBean 테스트 : UserDAO userDAO")
    void testGetOrderDAOsBean(){

    }
    @Test
    @DisplayName("testGetStationDAOBean_1 테스트 : String name")
    void testGetStationDAOBean_1(){

    }
    @Test
    @DisplayName("testGetStationDAOBean_2 테스트 : long stationId")
    void testGetStationDAOBean_2(){

    }
    @Test
    @DisplayName("testGetStationDAOBean_3 테스트 : StorageDAO storageDAO")
    void testGetStationDAOBean_3(){

    }
    @Test
    @DisplayName("testGetStationDAOBean_4 테스트 : RequestMakeOrderDTO requestMakeOrderDTO")
    void testGetStationDAOBean_4(){

    }
    @Test
    @DisplayName("testGetStationIdBean 테스트 : String stationName")
    void testGetStationIdBean(){

    }
    @Test
    @DisplayName("testGetStationStorageStatBean 테스트 : List<StorageDAO> start")
    void testGetStationStorageStatBean(){

    }
    @Test
    @DisplayName("testGetStorageDAOBean_1 테스트 : OrderDAO order")
    void testGetStorageDAOBean_1(){

    }
    @Test
    @DisplayName("testGetStorageDAOBean_2 테스트 : StoreDAO storeDAO")
    void testGetStorageDAOBean_2(){

    }
    @Test
    @DisplayName("testGetStorageDAOBean_3 테스트 : DeliveryDAO deliveryDAO")
    void testGetStorageDAOBean_3(){

    }
    @Test
    @DisplayName("testGetStorageDAOBean_4 테스트 : RequestMakeOrderDTO requestMakeOrderDTO")
    void testGetStorageDAOBean_4(){

    }
    @Test
    @DisplayName("testGetStorageDAOBean_5 테스트 : RequestStoreDTO requestStoreDTO")
    void testGetStorageDAOBean_5(){

    }

    @Test
    @DisplayName("testGetStorageDAOsBean 테스트 : List<OrderDAO> orders")
    void testGetStorageDAOsBean(){

    }

    @Test
    @DisplayName("testGetStorageldBean 테스트 : String stationName, int storageNum")
    void testGetStorageldBean(){

    }
    @Test
    @DisplayName("testGetStorageListBean 테스트 : StationDAO stationDAO")
    void testGetStorageListBean(){

    }
    @Test
    @DisplayName("testGetStoragePasswordBean 테스트 : StorageDAO storageDAO")
    void testGetStoragePasswordBean(){

    }
    @Test
    @DisplayName("testGetStoragePasswordDAOBean_1 테스트 : long storeId")
    void testGetStoragePasswordDAOBean_1(){

    }
    @Test
    @DisplayName("testGetStoragePasswordDAOBean_2 테스트 : StorageDAO storageDAO")
    void testGetStoragePasswordDAOBean_2(){

    }
    @Test
    @DisplayName("testGetStorageSizeCountBean 테스트 : StorageDAO storageDAO, StorageStationStatDTO storageStationStatDTO")
    void testGetStorageSizeCountBean(){

    }
    @Test
    @DisplayName("testGetStorageStatDTOBean 테스트 : List<StorageDAO> start")
    void testGetStorageStatDTOBean(){

    }
    @Test
    @DisplayName("testGetStoreDAOBean 테스트 : String userId")
    void testGetStoreDAOBean(){

    }
    @Test
    @DisplayName("testGetStoreProfitBean 테스트 : StorageBrand brand, String size")
    void testGetStoreProfitBean(){

    }
    @Test
    @DisplayName("testGetUserDAOBean_1 테스트 : long userId")
    void testGetUserDAOBean_1(){

    }
    @Test
    @DisplayName("testGetUserDAOBean_2 테스트 : RequestMakeOrderDTO requestMakeOrderDTO")
    void testGetUserDAOBean_2(){

    }
    @Test
    @DisplayName("testGetUserDAOBean_3 테스트 : RequestStoreDTO requestStoreDTO")
    void testGetUserDAOBean_3(){

    }
    @Test
    @DisplayName("testGetWaitingOrderBean 테스트 : StationDAO start, StationDAO end")
    void testGetWaitingOrderBean(){

    }
    @Test
    @DisplayName("testSaveOrderBean_1 테스트 : OrderDAO order, StorageDAO storageDAO")
    void testSaveOrderBean_1(){

    }
    @Test
    @DisplayName("testSaveOrderBean_2 테스트 : OrderDAO orderDAO")
    void testSaveOrderBean_2(){

    }
    @Test
    @DisplayName("testSaveStoreBean 테스트 : StoreDAO storeDAO")
    void testSaveStoreBean(){

    }
    @Test
    @DisplayName("testSetStorageStatDTOByOrderBea 테스트 : List<StorageStatDTO> storageStatDTOS, OrderDAO orderDAO")
    void testSetStorageStatDTOByOrderBea(){

    }

}
