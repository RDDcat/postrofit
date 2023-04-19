package com.postrofit.backend.BeanTest;
import com.postrofit.backend.Bean.Delivery3Bean;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestDelivery3Bean {
    @Autowired
    Delivery3Bean delivery3Bean;

    @Test
    @DisplayName("Delivery3Bean 테스트 : String _userId")
    void testDelivery3Bean() {
        String _userId = "1";
        // DeliveryDAO 가져오고
        // StorageId(1)로 다시 StorageDAO 가져오는데 storageNumber가 2임 (init 데이터)

        StoragePasswordDTO storagePasswordDTO = delivery3Bean.exec(_userId);

        assertEquals(storagePasswordDTO.getStorageNum(), 2);
    }
}
