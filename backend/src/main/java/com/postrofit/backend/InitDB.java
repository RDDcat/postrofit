package com.postrofit.backend;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import com.postrofit.backend.Model.Enum.StorageBrand;
import com.postrofit.backend.Repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class InitDB {

    private final InitService initService;



    @PostConstruct
    public void init(){
        initService.dbInit();
    }


    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {
        private final StationDAORepository stationDAORepository;
        private final UserDAORepository userDAORepository;
        private final StorageDAORepository storageDAORepository;
        private final StoragePasswordDAORepository storagePasswordDAORepository;
        private final OrderDAORepository orderDAORepository;
        private final DeliveryDAORepository deliveryDAORepository;
        private final StoreDAORepository storeDAORepository;


        public void dbInit() {
            StationDAO station1 = new StationDAO(0, "테스트역1", StorageBrand.SAENU);
            StationDAO station2 = new StationDAO(1, "테스트역2", StorageBrand.SAENU);
            StationDAO station3 = new StationDAO(2, "테스트역3", StorageBrand.SAENU);

            stationDAORepository.save(station1);
            stationDAORepository.save(station2);
            stationDAORepository.save(station3);

            UserDAO user1 = new UserDAO(0, "마로아님");
            UserDAO user2 = new UserDAO(1, "마로임");
            UserDAO user3 = new UserDAO(2, "마로");

            userDAORepository.save(user1);
            userDAORepository.save(user2);
            userDAORepository.save(user3);

            StorageDAO storage1 = new StorageDAO();

            storageDAORepository.save(storage1);

        }
    }
}
