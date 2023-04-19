package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.SetStorageStatDTOByOrderBean;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import com.postrofit.backend.Model.Enum.StorageSize;
import com.postrofit.backend.Model.Enum.StorageStat;
import com.postrofit.backend.Repository.OrderDAORepository;
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
public class TestSetStorageStatDTOByOrderBean {

    @Autowired
    SetStorageStatDTOByOrderBean setStorageStatDTOByOrderBean;
    @Autowired
    OrderDAORepository orderDAORepository;

    @Test
    @DisplayName("testSetStorageStatDTOByOrderBean 테스트 : List<StorageStatDTO> storageStatDTOS, OrderDAO orderDAO")
    void testSetStorageStatDTOByOrderBean(){
        List<StorageStatDTO> storageStatDTOList = new ArrayList<>();
        StorageStatDTO storageStatDTO = new StorageStatDTO();
        storageStatDTO.setStorageId(1L);
        storageStatDTO.setStorageNumber(1);
        storageStatDTO.setStorageStat(StorageStat.EMPTY);
        storageStatDTO.setStorageSize(StorageSize.SMALL);
        storageStatDTOList.add(storageStatDTO);
        OrderDAO orderDAO = orderDAORepository.findOrderDAOBystorageId(1);

        List<StorageStatDTO> storageStatDTOS = setStorageStatDTOByOrderBean.exec(storageStatDTOList, orderDAO);

        assertEquals(storageStatDTOList.size(), storageStatDTOS.size());
        assertEquals(StorageStat.WAIT, storageStatDTOS.get(0).getStorageStat());
    }
}
