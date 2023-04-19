package com.postrofit.backend.BeanTest;

import com.postrofit.backend.Bean.Delivery1Bean;
import com.postrofit.backend.Model.DTO.DeliveryCostDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestDelivery1Bean {
    @Autowired
    Delivery1Bean delivery1Bean;

    @Test
    @DisplayName("Delivery1Bean 테스트 : String start, String end")
    void testDelivery1Bean(){
        // TODO 구현 덜 됨. start랑 end 쓰질 않음.
        String start = "테스트역1";
        String end = "테스트역2";

        DeliveryCostDTO deliveryCostDTO = delivery1Bean.exec(start, end);

        assertEquals(1800, deliveryCostDTO.getMidCost());
    }
}
