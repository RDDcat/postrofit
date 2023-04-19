package com.postrofit.backend.BeanTest;
import com.postrofit.backend.Bean.GetDeliveryStorageListBean;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import com.postrofit.backend.Model.Enum.StorageStat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetDeliveryStorageListBean {
    @Autowired
    GetDeliveryStorageListBean getDeliveryStorageListBean;

    @Test
    @DisplayName("GetDeliveryStorageListBean 테스트 : String start, String end")
    void testGetDeliveryStorageListBean() {
        String start = "테스트역0";
        String end = "테스트역2";

        List<StorageStatDTO> storageStatDTOList = getDeliveryStorageListBean.exec(start, end);

        int expect = 0;

        for(StorageStatDTO dto: storageStatDTOList){
            if(dto.getStorageStat() == StorageStat.WAIT)
                expect++;
        }
        assertEquals(expect, 1);
    }
}
