package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.GetEmptyStorageCount;
import com.postrofit.backend.Bean.StorageStatBean;
import com.postrofit.backend.Bean.Store2Bean;
import com.postrofit.backend.Bean.Store3Bean;
import com.postrofit.backend.Model.DTO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    StorageStatBean storageStatBean;
    @Autowired
    Store2Bean store2Bean;
    @Autowired
    Store3Bean store3Bean;
    @Autowired
    GetEmptyStorageCount getEmptyStorageCount;

    public List<StorageStatDTO> store1(String start){return storageStatBean.exec(start);}

    public StoreProfitDTO store2(String start, String size){
        return store2Bean.exec(start, size);
    }

    public StoragePasswordDTO store3(String userId) {
        return store3Bean.exec(userId);
    }

    public void makeStore(RequestStoreDTO requestStoreDTO) {

    }

    public EmptyStorageCountDTO getEmptyCount(String stationName){
        EmptyStorageCountDTO emptyStorageCountDTO = getEmptyStorageCount.exec(stationName);
    }
}
