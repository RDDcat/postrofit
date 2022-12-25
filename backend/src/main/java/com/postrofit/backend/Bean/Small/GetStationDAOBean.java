package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Repository.StationDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetStationDAOBean {
    @Autowired
    StationDAORepository stationDAORepository;

    public StationDAO exec(String name) {
        return stationDAORepository.findByStationName(name);
    }

    public StationDAO exec(long storeId) {

        return null;
    }
}
