package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.StorageStatBean;
import com.postrofit.backend.Bean.Order2Bean;
import com.postrofit.backend.Bean.Order3Bean;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    StorageStatBean storageStatBean;
    @Autowired
    Order2Bean order2Bean;
    @Autowired
    Order3Bean order3Bean;

    public List<StorageStatDTO> order1(String start){
        return storageStatBean.exec(start);
    }
    public int order2(String start, String end, String size){
        return order2Bean.exec(start, end, size);
    }
    public StoragePasswordDTO order3(long userId){
        return order3Bean.exec(userId);
    }
}
