package com.postrofit.backend;

import com.postrofit.backend.Model.DAO.*;
import com.postrofit.backend.Model.Enum.OrderStat;
import com.postrofit.backend.Model.Enum.StorageBrand;
import com.postrofit.backend.Model.Enum.StorageSize;
import com.postrofit.backend.Model.Enum.StorageStat;
import com.postrofit.backend.Repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class InitDB {

    private final InitService initService;



    @PostConstruct
    public void init(){
        initService.dbInit();
    }


    @Component
    @RequiredArgsConstructor
    static class InitService {
        private final StationDAORepository stationDAORepository;
        private final UserDAORepository userDAORepository;
        private final StoragePasswordDAORepository storagePasswordDAORepository;
        private final StorageDAORepository storageDAORepository;
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
            UserDAO user3 = new UserDAO(2, "배달부1");
            UserDAO user4 = new UserDAO(3, "마로");

            userDAORepository.save(user1);
            userDAORepository.save(user2);
            userDAORepository.save(user3);
            userDAORepository.save(user4);

            StoragePasswordDAO storagePassword1 = new StoragePasswordDAO(0, "1234");
            StoragePasswordDAO storagePassword2 = new StoragePasswordDAO(1, "5678");
            StoragePasswordDAO storagePassword3 = new StoragePasswordDAO(2, "4945");
            StoragePasswordDAO storagePassword4 = new StoragePasswordDAO(3, "1129");
            StoragePasswordDAO storagePassword5 = new StoragePasswordDAO(4, "1212");
            StoragePasswordDAO storagePassword6 = new StoragePasswordDAO(5, "1313");
            StoragePasswordDAO storagePassword7 = new StoragePasswordDAO(6, "1414");
            StoragePasswordDAO storagePassword8 = new StoragePasswordDAO(7, "1515");
            StoragePasswordDAO storagePassword9 = new StoragePasswordDAO(8, "1616");
            StoragePasswordDAO storagePassword10 = new StoragePasswordDAO(9, "1717");
            StoragePasswordDAO storagePassword11 = new StoragePasswordDAO(10, "1188");
            StoragePasswordDAO storagePassword12 = new StoragePasswordDAO(11, "1122");
            StoragePasswordDAO storagePassword13 = new StoragePasswordDAO(12, "1111");
            StoragePasswordDAO storagePassword14 = new StoragePasswordDAO(13, "2222");

            storagePasswordDAORepository.save(storagePassword1);
            storagePasswordDAORepository.save(storagePassword2);
            storagePasswordDAORepository.save(storagePassword3);
            storagePasswordDAORepository.save(storagePassword4);
            storagePasswordDAORepository.save(storagePassword5);
            storagePasswordDAORepository.save(storagePassword6);
            storagePasswordDAORepository.save(storagePassword7);
            storagePasswordDAORepository.save(storagePassword8);
            storagePasswordDAORepository.save(storagePassword9);
            storagePasswordDAORepository.save(storagePassword10);
            storagePasswordDAORepository.save(storagePassword11);
            storagePasswordDAORepository.save(storagePassword12);
            storagePasswordDAORepository.save(storagePassword13);
            storagePasswordDAORepository.save(storagePassword14);

            StorageDAO storage1 = new StorageDAO(0, station1.getStationId(), storagePassword1.getStoragePasswordId(), 1, StorageStat.WAIT,  new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage2 = new StorageDAO(1, station1.getStationId(), storagePassword2.getStoragePasswordId(), 2, StorageStat.WAIT, new Date(System.currentTimeMillis()), StorageSize.BIG);
            StorageDAO storage3 = new StorageDAO(2, station1.getStationId(), storagePassword3.getStoragePasswordId(), 3, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);

            StorageDAO storage4 = new StorageDAO(3, station2.getStationId(), storagePassword4.getStoragePasswordId(), 1, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage5 = new StorageDAO(4, station2.getStationId(), storagePassword5.getStoragePasswordId(), 2, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage6 = new StorageDAO(5, station2.getStationId(), storagePassword6.getStoragePasswordId(), 3, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage7 = new StorageDAO(6, station2.getStationId(), storagePassword7.getStoragePasswordId(), 4, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage8 = new StorageDAO(7, station2.getStationId(), storagePassword8.getStoragePasswordId(), 5, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);

            StorageDAO storage9 = new StorageDAO(8, station3.getStationId(), storagePassword9.getStoragePasswordId(), 1, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage10 = new StorageDAO(9, station3.getStationId(), storagePassword10.getStoragePasswordId(), 2, StorageStat.STORE, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage11 = new StorageDAO(10, station3.getStationId(), storagePassword11.getStoragePasswordId(), 3, StorageStat.STORE, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage12 = new StorageDAO(11, station3.getStationId(), storagePassword12.getStoragePasswordId(), 4, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage13 = new StorageDAO(12, station3.getStationId(), storagePassword13.getStoragePasswordId(), 5, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage14 = new StorageDAO(13, station3.getStationId(), storagePassword14.getStoragePasswordId(), 6, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);

            storageDAORepository.save(storage1);
            storageDAORepository.save(storage2);
            storageDAORepository.save(storage3);
            storageDAORepository.save(storage4);
            storageDAORepository.save(storage5);
            storageDAORepository.save(storage6);
            storageDAORepository.save(storage7);
            storageDAORepository.save(storage8);
            storageDAORepository.save(storage9);
            storageDAORepository.save(storage10);
            storageDAORepository.save(storage11);
            storageDAORepository.save(storage12);
            storageDAORepository.save(storage13);
            storageDAORepository.save(storage14);

            OrderDAO order1 = new OrderDAO();
            order1.makeOrder(user1, storage1);
            OrderDAO order2 = new OrderDAO();
            order2.makeOrder(user2, storage2);
            OrderDAO order3 = new OrderDAO();
            order3.makeOrder(user2, storage4);

            orderDAORepository.save(order1);
            orderDAORepository.save(order2);
            orderDAORepository.save(order3);

            DeliveryDAO delivery1 = new DeliveryDAO();
            delivery1.makeDelivery(order2);

            deliveryDAORepository.save(delivery1);
            orderDAORepository.save(order3);

            StoreDAO store1 = new StoreDAO();
            store1.makeStore(user1, storage10);
            StoreDAO store2 = new StoreDAO();
            store2.makeStore(user4, storage11);

            storeDAORepository.save(store1);
            storeDAORepository.save(store2);

        }
    }
}
