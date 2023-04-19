package com.postrofit.backend.BeanTest;
import com.postrofit.backend.Bean.GetEmptyStorageCount;
import com.postrofit.backend.Model.DTO.EmptyStorageCountDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetEmptyStorageCount {
    @Autowired
    GetEmptyStorageCount getEmptyStorageCount;

    @Test
    @DisplayName("GetEmptyStorageCount 테스트 : String stationName")
    void testGetEmptyStorageCount() {
        String stationName = "테스트역1";

        EmptyStorageCountDTO emptyStorageCountDTO = getEmptyStorageCount.exec(stationName);

        assertEquals(6, emptyStorageCountDTO.getSmallCount());
    }
}
