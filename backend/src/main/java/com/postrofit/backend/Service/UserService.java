package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.GetUserHistoryBean;
import com.postrofit.backend.Bean.GetUserHistoryDetailBean;
import com.postrofit.backend.Bean.GetUserStoreBean;
import com.postrofit.backend.Bean.GetUserStoreDetailBean;
import com.postrofit.backend.Model.DTO.History.HistoryDTO;
import com.postrofit.backend.Model.DTO.HistoryDetailDTO;
import com.postrofit.backend.Model.DTO.RequestHistoryDetailDTO;
import com.postrofit.backend.Model.DTO.StorageDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    GetUserStoreBean getUserStoreBean;

    @Autowired
    GetUserStoreDetailBean getUserStoreDetailBean;

    @Autowired
    GetUserHistoryBean getUserHistoryBean;

    @Autowired
    GetUserHistoryDetailBean getUserHistoryDetailBean;

    public void getUserStoreInfo(long userId){
        getUserStoreBean.exec(userId);
    }

    public StorageDetailDTO getUserStoreStorageDetail(long storageId){
        return getUserStoreDetailBean.exec(storageId);
    }

    public List<HistoryDTO> getUserHistory(long userId){
        return getUserHistoryBean.exec(userId);
    }

    public HistoryDetailDTO getUserHistoryDetail(RequestHistoryDetailDTO requestHistoryDetailDTO) {
        return getUserHistoryDetailBean.exec(requestHistoryDetailDTO);
    }
}
