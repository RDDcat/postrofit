package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.Store1Bean;
import com.postrofit.backend.Bean.Store2Bean;
import com.postrofit.backend.Bean.Store3Bean;
import com.postrofit.backend.Model.DTO.Storage3DTO;
import com.postrofit.backend.Model.DTO.StorageStationStatDTO;
import com.postrofit.backend.Model.DTO.StoreProfitDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    Store1Bean store1Bean;
    @Autowired
    Store2Bean store2Bean;
    @Autowired
    Store3Bean store3Bean;

    public StorageStationStatDTO store1(String start){return store1Bean.exec(start);}

    public StoreProfitDTO store2(String start, String size){
        return store2Bean.exec(start, size);
    }

    public Storage3DTO store3(String userId) {
        return store3Bean.exec(userId);
    }
}
