package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Repository.OrderDAORepository;
import com.postrofit.backend.Repository.StorageDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveOrderBean {
    @Autowired
    OrderDAORepository orderDAORepository;
    @Autowired
    StorageDAORepository storageDAORepository;

    public void exec(OrderDAO order, StorageDAO storageDAO) {
        orderDAORepository.save(order);
        storageDAORepository.save(storageDAO);
    }
}
