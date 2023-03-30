package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Repository.StorageDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetStorageDAOBean {
    @Autowired
    StorageDAORepository storageRepository;

    public StorageDAO exec(long storeId) {


        return null;
    }

    public StorageDAO exec(OrderDAO order) {
        return storageRepository.findStorageDAOByStorageId(order.getStorageId());
    }

    public StorageDAO exec(StoreDAO storeDAO) {
        return storageRepository.findStorageDAOByStorageId(storeDAO.getStorageId());
    }
}
