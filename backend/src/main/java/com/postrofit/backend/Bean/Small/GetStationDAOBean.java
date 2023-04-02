package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.RequestMakeOrderDTO;
import com.postrofit.backend.Repository.StationDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetStationDAOBean {
    @Autowired
    StationDAORepository stationRepository;

    public StationDAO exec(String name) {
        return stationRepository.findByStationName(name);
    }

    public StationDAO exec(long stationId) {
        return stationRepository.findById(stationId).get();
    }

    public StationDAO exec(StorageDAO storageDAO) {
        return stationRepository.findById(storageDAO.getStationId()).get();
    }

    public StationDAO exec(RequestMakeOrderDTO requestMakeOrderDTO) {
        return stationRepository.findByStationName(requestMakeOrderDTO.getEndStationName());
    }
}
