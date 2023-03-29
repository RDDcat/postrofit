package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoragePasswordDAO;
import com.postrofit.backend.Repository.StoragePasswordDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetStoragePasswordDAOBean {
    @Autowired
    StoragePasswordDAORepository storagePasswordRepository;

    public StoragePasswordDAO exec(long storeId) {


        return null;
    }

    public StoragePasswordDAO exec(StorageDAO storageDAO) {
        return storagePasswordRepository.findById(storageDAO.getStoragePasswordId()).get();
    }
}
