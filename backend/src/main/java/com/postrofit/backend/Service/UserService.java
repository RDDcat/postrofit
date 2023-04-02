package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.GetUserHistoryDetailBean;
import com.postrofit.backend.Model.DTO.HistoryDetailDTO;
import com.postrofit.backend.Model.DTO.RequestHistoryDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    GetUserHistoryDetailBean getUserHistoryDetailBean;


    public HistoryDetailDTO getUserHistoryDetail(RequestHistoryDetailDTO requestHistoryDetailDTO) {
        return getUserHistoryDetailBean.exec(requestHistoryDetailDTO);
    }
}
