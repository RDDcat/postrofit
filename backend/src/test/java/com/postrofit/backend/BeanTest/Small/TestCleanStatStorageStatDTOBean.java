package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.CleanStatStorageStatDTOBean;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import com.postrofit.backend.Model.Enum.StorageSize;
import com.postrofit.backend.Model.Enum.StorageStat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCleanStatStorageStatDTOBean {

    @Autowired
    CleanStatStorageStatDTOBean cleanStatStorageStatDTOBean;

    @Test
    @DisplayName("testCleanStatStorageStatDTOBean 테스트 : List<StorageStatDTO> storageStatDTOS")
    void testCleanStatStorageStatDTOBean() {
        List<StorageStatDTO> storageStatDTOList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            StorageStatDTO storageStatDTO = new StorageStatDTO();
            storageStatDTO.setStorageId(i);
            storageStatDTO.setStorageNumber(1);
            storageStatDTO.setStorageStat(StorageStat.STORE);
            storageStatDTO.setStorageSize(StorageSize.BIG);
            storageStatDTOList.add(storageStatDTO);
        }
        List<StorageStatDTO> storageStatDTOList2 = cleanStatStorageStatDTOBean.exec(storageStatDTOList);

        assertEquals(storageStatDTOList, storageStatDTOList2);
    }
}
