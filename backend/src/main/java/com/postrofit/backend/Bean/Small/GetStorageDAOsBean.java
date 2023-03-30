package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetStorageDAOsBean {
    @Autowired
    GetStorageDAOBean getStorageDAOBean;

    public List<StorageDAO> exec(List<OrderDAO> orders) {
        List<StorageDAO> storageDAOS = new ArrayList<>();
        for (OrderDAO order: orders) {
            storageDAOS.add(getStorageDAOBean.exec(order));
        }
        return storageDAOS;
    }
}
