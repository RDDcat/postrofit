package com.postrofit.backend.Bean.legacy;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Repository.StorageDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetStorageListBean {
    @Autowired
    StorageDAORepository storageDAORepository;

    public List<StorageDAO> exec(StationDAO stationDAO){
        List<StorageDAO> storageDAOList = storageDAORepository.findStorageDAOByStationId(stationDAO.getStationId());

        return storageDAOList;
    }
}
