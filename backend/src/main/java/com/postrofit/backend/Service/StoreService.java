package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.StationStorageStatBean;
import com.postrofit.backend.Bean.Store2Bean;
import com.postrofit.backend.Bean.Store3Bean;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import com.postrofit.backend.Model.DTO.StoreProfitDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    StationStorageStatBean stationStorageStatBean;
    @Autowired
    Store2Bean store2Bean;
    @Autowired
    Store3Bean store3Bean;

    public List<StorageStatDTO> store1(String start){return stationStorageStatBean.exec(start);}

    public StoreProfitDTO store2(String start, String size){
        return store2Bean.exec(start, size);
    }

    public StoragePasswordDTO store3(String userId) {
        return store3Bean.exec(userId);
    }
}
