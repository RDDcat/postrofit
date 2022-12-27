package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Repository.StationDAORepository;
import com.postrofit.backend.Repository.StorageDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetStorageIdBean {
    @Autowired
    StationDAORepository stationDAORepository;
    @Autowired
    StorageDAORepository storageDAORepository;

    public StorageDAO exec(String stationName, int storageNum) {
        StationDAO stationDAO = stationDAORepository.findByStationName(stationName);

        StorageDAO storageDAO = storageDAORepository.findStorageDAOByStationDAOAndStorageNumber(stationDAO, storageNum);

        return storageDAO;
    }
}
