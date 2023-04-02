package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Repository.StorageDAORepository;
import com.postrofit.backend.Repository.StoreDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetStoreDAOBean {
    @Autowired
    StoreDAORepository storeDAORepository;

    public StoreDAO exec(String userId) {
        // ????? ㅋㅋㅋㅋㅋ
        return storeDAORepository.findStoreDAOByUserId(Long.parseLong(userId));
    }
}
