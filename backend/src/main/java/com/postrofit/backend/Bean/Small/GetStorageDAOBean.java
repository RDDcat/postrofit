package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.*;
import com.postrofit.backend.Model.DTO.RequestMakeOrderDTO;
import com.postrofit.backend.Model.DTO.RequestStartStoragePasswordDTO;
import com.postrofit.backend.Model.DTO.RequestStoreDTO;
import com.postrofit.backend.Repository.StorageDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetStorageDAOBean {
    @Autowired
    StorageDAORepository storageRepository;

    public StorageDAO exec(long storageId) {
        return storageRepository.findById(storageId).orElse(null);
    }

    public StorageDAO exec(OrderDAO order) {
        return storageRepository.findStorageDAOByStorageId(order.getStorageId());
    }

    public StorageDAO exec(StoreDAO storeDAO) {
        return storageRepository.findStorageDAOByStorageId(storeDAO.getStorageId());
    }

    public StorageDAO exec(DeliveryDAO deliveryDAO) {
        return storageRepository.findStorageDAOByStorageId(deliveryDAO.getStorageId());
    }

    public StorageDAO exec(RequestMakeOrderDTO requestMakeOrderDTO) {
        return storageRepository.findStorageDAOByStorageId(requestMakeOrderDTO.getStorageId());
    }

    public StorageDAO exec(RequestStoreDTO requestStoreDTO) {
        return storageRepository.findStorageDAOByStorageId(requestStoreDTO.getStorageId());
    }

    public StorageDAO exec(StationDAO stationDAO, RequestStartStoragePasswordDTO requestStartStoragePasswordDTO) {
        return storageRepository.findStorageDAOByStationIdAndStorageNumber(stationDAO.getStationId(), requestStartStoragePasswordDTO.getStorageNum());
    }
}
