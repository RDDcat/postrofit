package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Repository.StationDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetStationIdBean {
    @Autowired
    StationDAORepository stationDAORepository;

    public Long exec(String stationName){
        StationDAO stationDAO = stationDAORepository.findByStationName(stationName);

        long stationId = stationDAO.getStationId();

        return stationId;
    }

}
