package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Repository.StorageDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetStorageListBean {
    @Autowired
    StorageDAORepository storageDAORepository;

    public List<StorageDAO> exec(Long stationId){
        List<StorageDAO> storageDAOList = storageDAORepository.findAllByStationId(stationId);

        return storageDAOList;
    }
}
