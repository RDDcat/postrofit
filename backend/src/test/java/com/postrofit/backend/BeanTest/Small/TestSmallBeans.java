package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class TestSmallBeans {
    @Autowired
    GetStationIdBean getStationIdBean;
    @Autowired
    GetStorageListBean getStorageListBean;
    @Autowired
    GetStorageStatDTOBean getStorageStatDTOBean;
    @Autowired
    GetOrderDAOBean getOrderDAOBean;
    @Autowired
    GetStoragePasswordBean getStoragePasswordBean;


    @Test
    public void testGetOrderDAOBean(){

    }
    @Test
    public void testGetStationIdBean(){

    }
    @Test
    public void testGetStorageListBean(){

    }
    @Test
    public void testGetStoragePasswordBean(){

    }
    @Test
    public void testGetStorageStatDTOBean(){

    }
}
