package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.RequestMakeOrderDTO;
import com.postrofit.backend.Model.DTO.RequestStartStoragePasswordDTO;
import com.postrofit.backend.Repository.StationDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetStationDAOBean {
    @Autowired
    StationDAORepository stationRepository;

    // TODO name(역 이름)을 가지고 StationDAO를 가져오기
    public StationDAO exec(String name) {
        return stationRepository.findByStationName(name);
    }

    // TODO 역 ID를 가지고 StationDAO를 가져오기
    public StationDAO exec(long stationId) {
        return stationRepository.findById(stationId).get();
    }

    // TODO StorageDAO(보관함 정보)를 가지고 보관함이 있는 역(StationDAO)정보 가져오기
    public StationDAO exec(StorageDAO storageDAO) {
        return stationRepository.findById(storageDAO.getStationId()).get();
    }

    public StationDAO exec(RequestMakeOrderDTO requestMakeOrderDTO) {
        return stationRepository.findByStationName(requestMakeOrderDTO.getEndStationName());
    }

    public StationDAO exec(RequestStartStoragePasswordDTO requestStartStoragePasswordDTO) {
        return stationRepository.findByStationName(requestStartStoragePasswordDTO.getStart());
    }
}
