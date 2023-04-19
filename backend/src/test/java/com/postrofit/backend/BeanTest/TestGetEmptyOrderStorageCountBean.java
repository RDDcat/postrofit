package com.postrofit.backend.BeanTest;
import com.postrofit.backend.Bean.GetEmptyOrderStorageCountBean;
import com.postrofit.backend.Model.DTO.EmptyOrderStorageCountDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetEmptyOrderStorageCountBean {
    @Autowired
    GetEmptyOrderStorageCountBean getEmptyOrderStorageCountBean;

    @Test
    @DisplayName("GetEmptyOrderStorageCountBean 테스트 : String stationName")
    void testGetEmptyOrderStorageCountBean() {
        String stationName = "테스트역1";

        EmptyOrderStorageCountDTO emptyOrderStorageCountDTO = getEmptyOrderStorageCountBean.exec(stationName);

        assertEquals(emptyOrderStorageCountDTO.getSmallCount(), 6);
    }
}
