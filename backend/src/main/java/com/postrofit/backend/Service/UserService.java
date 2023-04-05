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

    public void getUserStoreInfo(){
        getUserStoreBean.exec();
    }

    public StorageDetailDTO getUserStoreStorageDetail(){
        return getUserStoreDetailBean.exec();
    }

    public List<HistoryDTO> getUserHistory(){
        return getUserHistoryBean.exec();
    }

    public HistoryDetailDTO getUserHistoryDetail(RequestHistoryDetailDTO requestHistoryDetailDTO) {
        return getUserHistoryDetailBean.exec(requestHistoryDetailDTO);
    }
}
