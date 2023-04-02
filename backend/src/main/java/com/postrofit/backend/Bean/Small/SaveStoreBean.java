package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Repository.StoreDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveStoreBean {
    @Autowired
    StoreDAORepository storeDAORepository;
    public void exec(StoreDAO storeDAO){
        storeDAORepository.save(storeDAO);

    }
}
