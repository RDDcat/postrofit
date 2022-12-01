package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.Store1Bean;
import com.postrofit.backend.Bean.Store2Bean;
import com.postrofit.backend.Model.DTO.StationStorageStatDTO;
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

    public StationStorageStatDTO store1(String start){return store1Bean.exec(start);}

    public List<StoreProfitDTO> store2(String start, String end, String size){
        return store2Bean.exec(start, end, size);
    }
}
