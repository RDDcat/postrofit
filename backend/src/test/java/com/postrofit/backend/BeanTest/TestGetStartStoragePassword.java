package com.postrofit.backend.BeanTest;
import com.postrofit.backend.Bean.GetStartStoragePassword;
import com.postrofit.backend.Model.DTO.RequestStartStoragePasswordDTO;
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
public class TestGetStartStoragePassword {
    @Autowired
    GetStartStoragePassword getStartStoragePassword;

    @Test
    @DisplayName("GetStartStoragePassword 테스트 : RequestStartStoragePasswordDTO requestStartStoragePasswordDTO")
    void testGetStartStoragePassword() {
        RequestStartStoragePasswordDTO requestStartStoragePasswordDTO = new RequestStartStoragePasswordDTO();
        requestStartStoragePasswordDTO.setStart("테스트역0");
        requestStartStoragePasswordDTO.setStorageNum(1);

        StoragePasswordDTO storagePasswordDTO = getStartStoragePassword.exec(requestStartStoragePasswordDTO);

        assertEquals(storagePasswordDTO.getStorageNum(), requestStartStoragePasswordDTO.getStorageNum());
    }
}
