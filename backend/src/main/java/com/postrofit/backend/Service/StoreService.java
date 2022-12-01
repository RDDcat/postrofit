package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.Store1Bean;
import com.postrofit.backend.Model.DTO.StationStorageStatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
    @Autowired
    Store1Bean store1Bean;

    public StationStorageStatDTO store1(String start){return store1Bean.exec(start);}
}
