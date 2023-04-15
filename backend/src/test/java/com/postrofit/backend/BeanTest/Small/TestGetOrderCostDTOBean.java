package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetOrderCostDTOBean;
import com.postrofit.backend.Model.DTO.OrderCostDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetOrderCostDTOBean {

    @Autowired
    GetOrderCostDTOBean getOrderCostDTOBean;

    @Test
    @DisplayName("testGetOrderCostDTOBean 테스트 : String start, String end")
    void testGetOrderCostDTOBean(){
        String start = "test1";
        String end = "test2";
        int smallCost = 2000;

        OrderCostDTO orderCostDTO = getOrderCostDTOBean.exec(start, end);

        assertEquals(smallCost, orderCostDTO.getSmallCost());
    }

}
