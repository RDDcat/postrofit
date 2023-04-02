package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Repository.OrderDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetWaitingOrderBean {
    @Autowired
    OrderDAORepository orderDAORepository;

    public OrderDAO exec(StationDAO start, StationDAO end){

        return orderDAORepository.findFirstByStartStationIdAndEndStationIdOrderByCreateAtDesc(start.getStationId(), end.getStationId());
    }
}
