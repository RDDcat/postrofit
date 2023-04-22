package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Repository.StorageDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetStorageDAOsBean {
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    @Autowired
    StorageDAORepository storageDAORepository;
    public List<StorageDAO> exec(List<OrderDAO> orders) {
        List<StorageDAO> storageDAOS = new ArrayList<>();
        for (OrderDAO order: orders) {
            storageDAOS.add(getStorageDAOBean.exec(order));
        }
        return storageDAOS;
    }

    public List<StorageDAO> exec(StationDAO stationDAO){
        return storageDAORepository.findStorageDAOByStationId(stationDAO.getStationId());
    }
}
