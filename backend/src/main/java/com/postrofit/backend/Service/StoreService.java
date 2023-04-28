package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.*;
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
    MakeStoreBean makeStoreBean;

    @Autowired
    GetStoreIdsBean getStoreIdsBean;
    @Autowired
    GetResponseStoreIdBean getStoreIdBean;
    @Autowired
    GetEmptyStorageCount getEmptyStorageCount;

    public List<StorageStatDTO> store1(String start){return storageStatBean.exec(start);}

    public StoreProfitDTO store2(String start, String size){
        return store2Bean.exec(start, size);
    }

    public StoragePasswordDTO store3(String userId) {
        return store3Bean.exec(userId);
    }

    public ResponseStorePostDTO makeStore(RequestStoreDTO requestStoreDTO) {
        return makeStoreBean.exec(requestStoreDTO);
    }

    public ResponseStoreSampleDTO getStoreId(long storeId) {
        return getStoreIdBean.exec(storeId);
    }
    public ResponseStoreIdsDTO getStoreIds(long userId) {
        return getStoreIdsBean.exec(userId);
    }

    public EmptyStorageCountDTO getEmptyCount(String stationName){
        return getEmptyStorageCount.exec(stationName);
    }

}
