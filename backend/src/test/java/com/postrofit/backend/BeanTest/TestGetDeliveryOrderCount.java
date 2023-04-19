package com.postrofit.backend.BeanTest;
import com.postrofit.backend.Bean.GetDeliveryOrderCount;
import com.postrofit.backend.Model.DTO.DeliveryCountDTO;
import com.postrofit.backend.Model.DTO.RequestStartEndDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetDeliveryOrderCount {
    @Autowired
    GetDeliveryOrderCount getDeliveryOrderCount;

    @Test
    @DisplayName("GetDeliveryOrderCount 테스트 : RequestStartEndDTO requestStartEndDTO")
    void testGetDeliveryOrderCount() {
        RequestStartEndDTO requestStartEndDTO = new RequestStartEndDTO();
        requestStartEndDTO.setStart("테스트역0");
        requestStartEndDTO.setEnd("테스트역2");

        DeliveryCountDTO deliveryCountDTO = getDeliveryOrderCount.exec(requestStartEndDTO);

        assertEquals(3, deliveryCountDTO.getSmallCount());
        assertEquals(0, deliveryCountDTO.getMidCount());
    }
}
