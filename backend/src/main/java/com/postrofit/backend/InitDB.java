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
            StationDAO station0 = new StationDAO(0, "테스트역0", StorageBrand.SAENU);
            StationDAO station1 = new StationDAO(1, "테스트역1", StorageBrand.SAENU);
            StationDAO station2 = new StationDAO(2, "테스트역2", StorageBrand.SAENU);
            StationDAO station3 = new StationDAO(3, "테스트역3", StorageBrand.SAENU);

            stationDAORepository.save(station0);
            stationDAORepository.save(station1);
            stationDAORepository.save(station2);
            stationDAORepository.save(station3);

            UserDAO user1 = new UserDAO(0, "마로아님");
            UserDAO user2 = new UserDAO(1, "마로임");
            UserDAO user3 = new UserDAO(2, "배달부1");
            UserDAO user4 = new UserDAO(3, "마로3");
            UserDAO user5 = new UserDAO(4, "마로4");
            UserDAO user6 = new UserDAO(5, "마로5");

            userDAORepository.save(user1);
            userDAORepository.save(user2);
            userDAORepository.save(user3);
            userDAORepository.save(user4);
            userDAORepository.save(user5);
            userDAORepository.save(user6);

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
            StoragePasswordDAO storagePassword15 = new StoragePasswordDAO(14, "2222");
            StoragePasswordDAO storagePassword16 = new StoragePasswordDAO(15, "2222");
            StoragePasswordDAO storagePassword17 = new StoragePasswordDAO(16, "2222");
            StoragePasswordDAO storagePassword18 = new StoragePasswordDAO(17, "2222");
            StoragePasswordDAO storagePassword19 = new StoragePasswordDAO(18, "2222");
            StoragePasswordDAO storagePassword20 = new StoragePasswordDAO(19, "2222");
            StoragePasswordDAO storagePassword21 = new StoragePasswordDAO(20, "2222");
            StoragePasswordDAO storagePassword22 = new StoragePasswordDAO(21, "2222");
            StoragePasswordDAO storagePassword23 = new StoragePasswordDAO(22, "2222");
            StoragePasswordDAO storagePassword24 = new StoragePasswordDAO(23, "2222");
            StoragePasswordDAO storagePassword25 = new StoragePasswordDAO(24, "2222");
            StoragePasswordDAO storagePassword26 = new StoragePasswordDAO(25, "2222");
            StoragePasswordDAO storagePassword27 = new StoragePasswordDAO(26, "2222");
            StoragePasswordDAO storagePassword28 = new StoragePasswordDAO(27, "2222");
            StoragePasswordDAO storagePassword29 = new StoragePasswordDAO(28, "2222");
            StoragePasswordDAO storagePassword30 = new StoragePasswordDAO(29, "2222");
            StoragePasswordDAO storagePassword31 = new StoragePasswordDAO(30, "2222");
            StoragePasswordDAO storagePassword32 = new StoragePasswordDAO(31, "2222");
            StoragePasswordDAO storagePassword33 = new StoragePasswordDAO(32, "2222");
            StoragePasswordDAO storagePassword34 = new StoragePasswordDAO(34, "2222");
            StoragePasswordDAO storagePassword35 = new StoragePasswordDAO(35, "2222");
            StoragePasswordDAO storagePassword36 = new StoragePasswordDAO(36, "2222");
            StoragePasswordDAO storagePassword37 = new StoragePasswordDAO(37, "2222");
            StoragePasswordDAO storagePassword38 = new StoragePasswordDAO(38, "2222");
            StoragePasswordDAO storagePassword39 = new StoragePasswordDAO(39, "2222");
            StoragePasswordDAO storagePassword40 = new StoragePasswordDAO(40, "2222");
            StoragePasswordDAO storagePassword41 = new StoragePasswordDAO(41, "2222");
            StoragePasswordDAO storagePassword42 = new StoragePasswordDAO(42, "2222");
            StoragePasswordDAO storagePassword43 = new StoragePasswordDAO(43, "2222");
            StoragePasswordDAO storagePassword44 = new StoragePasswordDAO(44, "2222");
            StoragePasswordDAO storagePassword45 = new StoragePasswordDAO(45, "2222");
            StoragePasswordDAO storagePassword46 = new StoragePasswordDAO(46, "2222");
            StoragePasswordDAO storagePassword47 = new StoragePasswordDAO(47, "2222");
            StoragePasswordDAO storagePassword48 = new StoragePasswordDAO(48, "2222");
            StoragePasswordDAO storagePassword49 = new StoragePasswordDAO(49, "2222");
            StoragePasswordDAO storagePassword50 = new StoragePasswordDAO(50, "7788");
            StoragePasswordDAO storagePassword51 = new StoragePasswordDAO(51, "1111");

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
            storagePasswordDAORepository.save(storagePassword15);
            storagePasswordDAORepository.save(storagePassword16);
            storagePasswordDAORepository.save(storagePassword17);
            storagePasswordDAORepository.save(storagePassword18);
            storagePasswordDAORepository.save(storagePassword19);
            storagePasswordDAORepository.save(storagePassword20);
            storagePasswordDAORepository.save(storagePassword21);
            storagePasswordDAORepository.save(storagePassword22);
            storagePasswordDAORepository.save(storagePassword23);
            storagePasswordDAORepository.save(storagePassword24);
            storagePasswordDAORepository.save(storagePassword25);
            storagePasswordDAORepository.save(storagePassword26);
            storagePasswordDAORepository.save(storagePassword27);
            storagePasswordDAORepository.save(storagePassword28);
            storagePasswordDAORepository.save(storagePassword29);
            storagePasswordDAORepository.save(storagePassword30);
            storagePasswordDAORepository.save(storagePassword31);
            storagePasswordDAORepository.save(storagePassword32);
            storagePasswordDAORepository.save(storagePassword33);
            storagePasswordDAORepository.save(storagePassword34);
            storagePasswordDAORepository.save(storagePassword35);
            storagePasswordDAORepository.save(storagePassword36);
            storagePasswordDAORepository.save(storagePassword37);
            storagePasswordDAORepository.save(storagePassword38);
            storagePasswordDAORepository.save(storagePassword39);
            storagePasswordDAORepository.save(storagePassword40);
            storagePasswordDAORepository.save(storagePassword41);
            storagePasswordDAORepository.save(storagePassword42);
            storagePasswordDAORepository.save(storagePassword43);
            storagePasswordDAORepository.save(storagePassword44);
            storagePasswordDAORepository.save(storagePassword45);
            storagePasswordDAORepository.save(storagePassword46);
            storagePasswordDAORepository.save(storagePassword47);
            storagePasswordDAORepository.save(storagePassword48);
            storagePasswordDAORepository.save(storagePassword49);
            storagePasswordDAORepository.save(storagePassword50);
            storagePasswordDAORepository.save(storagePassword51);

            StorageDAO storage1 = new StorageDAO(0, station0.getStationId(), storagePassword1.getStoragePasswordId(), 1, StorageStat.WAIT,  new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage2 = new StorageDAO(1, station0.getStationId(), storagePassword2.getStoragePasswordId(), 2, StorageStat.WAIT, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage3 = new StorageDAO(2, station0.getStationId(), storagePassword3.getStoragePasswordId(), 3, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage4 = new StorageDAO(3, station0.getStationId(), storagePassword4.getStoragePasswordId(), 4, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage5 = new StorageDAO(4, station0.getStationId(), storagePassword5.getStoragePasswordId(), 5, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage6 = new StorageDAO(5, station0.getStationId(), storagePassword6.getStoragePasswordId(), 6, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage7 = new StorageDAO(6, station0.getStationId(), storagePassword7.getStoragePasswordId(), 7, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage8 = new StorageDAO(7, station0.getStationId(), storagePassword8.getStoragePasswordId(), 8, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage9 = new StorageDAO(8, station0.getStationId(), storagePassword9.getStoragePasswordId(), 9, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage10 = new StorageDAO(9, station0.getStationId(), storagePassword10.getStoragePasswordId(), 10, StorageStat.STORE, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage11 = new StorageDAO(10, station0.getStationId(), storagePassword11.getStoragePasswordId(), 11, StorageStat.STORE, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage12 = new StorageDAO(11, station0.getStationId(), storagePassword12.getStoragePasswordId(), 12, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage13 = new StorageDAO(12, station0.getStationId(), storagePassword13.getStoragePasswordId(), 13, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.BIG);
            StorageDAO storage14 = new StorageDAO(13, station0.getStationId(), storagePassword14.getStoragePasswordId(), 14, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.BIG);
            StorageDAO storage15 = new StorageDAO(14, station0.getStationId(), storagePassword15.getStoragePasswordId(), 15, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.BIG);

            StorageDAO storage16 = new StorageDAO(15, station1.getStationId(), storagePassword16.getStoragePasswordId(), 1, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage17 = new StorageDAO(16, station1.getStationId(), storagePassword17.getStoragePasswordId(), 2, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage18 = new StorageDAO(17, station1.getStationId(), storagePassword18.getStoragePasswordId(), 3, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage19 = new StorageDAO(18, station1.getStationId(), storagePassword19.getStoragePasswordId(), 4, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage20 = new StorageDAO(19, station1.getStationId(), storagePassword20.getStoragePasswordId(), 5, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage21 = new StorageDAO(20, station1.getStationId(), storagePassword21.getStoragePasswordId(), 6, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage22 = new StorageDAO(21, station1.getStationId(), storagePassword22.getStoragePasswordId(), 7, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage23 = new StorageDAO(22, station1.getStationId(), storagePassword23.getStoragePasswordId(), 8, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage24 = new StorageDAO(23, station1.getStationId(), storagePassword24.getStoragePasswordId(), 9, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage25 = new StorageDAO(24, station1.getStationId(), storagePassword25.getStoragePasswordId(), 10, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage26 = new StorageDAO(25, station1.getStationId(), storagePassword26.getStoragePasswordId(), 11, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage27 = new StorageDAO(26, station1.getStationId(), storagePassword27.getStoragePasswordId(), 12, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage28 = new StorageDAO(27, station1.getStationId(), storagePassword28.getStoragePasswordId(), 13, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage29 = new StorageDAO(28, station1.getStationId(), storagePassword29.getStoragePasswordId(), 14, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);

            StorageDAO storage30 = new StorageDAO(29, station2.getStationId(), storagePassword30.getStoragePasswordId(), 1, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage31 = new StorageDAO(30, station2.getStationId(), storagePassword31.getStoragePasswordId(), 2, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage32 = new StorageDAO(31, station2.getStationId(), storagePassword32.getStoragePasswordId(), 3, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage33 = new StorageDAO(32, station2.getStationId(), storagePassword33.getStoragePasswordId(), 4, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage34 = new StorageDAO(33, station2.getStationId(), storagePassword34.getStoragePasswordId(), 5, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage35 = new StorageDAO(34, station2.getStationId(), storagePassword35.getStoragePasswordId(), 6, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage36 = new StorageDAO(35, station2.getStationId(), storagePassword36.getStoragePasswordId(), 7, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage37 = new StorageDAO(36, station2.getStationId(), storagePassword37.getStoragePasswordId(), 8, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage38 = new StorageDAO(37, station2.getStationId(), storagePassword38.getStoragePasswordId(), 9, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage39 = new StorageDAO(38, station2.getStationId(), storagePassword39.getStoragePasswordId(), 10, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);

            StorageDAO storage40 = new StorageDAO(39, station3.getStationId(), storagePassword40.getStoragePasswordId(), 1, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage41 = new StorageDAO(40, station3.getStationId(), storagePassword41.getStoragePasswordId(), 2, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage42 = new StorageDAO(41, station3.getStationId(), storagePassword42.getStoragePasswordId(), 3, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage43 = new StorageDAO(42, station3.getStationId(), storagePassword43.getStoragePasswordId(), 4, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage44 = new StorageDAO(43, station3.getStationId(), storagePassword44.getStoragePasswordId(), 5, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage45 = new StorageDAO(44, station3.getStationId(), storagePassword45.getStoragePasswordId(), 6, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.SMALL);
            StorageDAO storage46 = new StorageDAO(45, station3.getStationId(), storagePassword46.getStoragePasswordId(), 7, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage47 = new StorageDAO(46, station3.getStationId(), storagePassword47.getStoragePasswordId(), 8, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage48 = new StorageDAO(47, station3.getStationId(), storagePassword48.getStoragePasswordId(), 9, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage49 = new StorageDAO(48, station3.getStationId(), storagePassword49.getStoragePasswordId(), 10, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage50 = new StorageDAO(49, station3.getStationId(), storagePassword50.getStoragePasswordId(), 11, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);
            StorageDAO storage51 = new StorageDAO(50, station3.getStationId(), storagePassword51.getStoragePasswordId(), 12, StorageStat.EMPTY, new Date(System.currentTimeMillis()), StorageSize.MID);

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
            storageDAORepository.save(storage15);
            storageDAORepository.save(storage16);
            storageDAORepository.save(storage17);
            storageDAORepository.save(storage18);
            storageDAORepository.save(storage19);
            storageDAORepository.save(storage20);
            storageDAORepository.save(storage21);
            storageDAORepository.save(storage22);
            storageDAORepository.save(storage23);
            storageDAORepository.save(storage24);
            storageDAORepository.save(storage25);
            storageDAORepository.save(storage26);
            storageDAORepository.save(storage27);
            storageDAORepository.save(storage28);
            storageDAORepository.save(storage29);
            storageDAORepository.save(storage30);
            storageDAORepository.save(storage31);
            storageDAORepository.save(storage32);
            storageDAORepository.save(storage33);
            storageDAORepository.save(storage34);
            storageDAORepository.save(storage35);
            storageDAORepository.save(storage36);
            storageDAORepository.save(storage37);
            storageDAORepository.save(storage38);
            storageDAORepository.save(storage39);
            storageDAORepository.save(storage40);
            storageDAORepository.save(storage41);
            storageDAORepository.save(storage42);
            storageDAORepository.save(storage43);
            storageDAORepository.save(storage44);
            storageDAORepository.save(storage45);
            storageDAORepository.save(storage46);
            storageDAORepository.save(storage47);
            storageDAORepository.save(storage48);
            storageDAORepository.save(storage49);
            storageDAORepository.save(storage50);
            storageDAORepository.save(storage51);

            OrderDAO order1 = new OrderDAO();
            order1.makeOrder(user1, storage1, station2);
            OrderDAO order2 = new OrderDAO();
            order2.makeOrder(user2, storage2, station3);
            OrderDAO order3 = new OrderDAO();
            order3.makeOrder(user2, storage4, station2);
            OrderDAO order4 = new OrderDAO();
            order3.makeOrder(user3, storage5, station3);
            OrderDAO order5 = new OrderDAO();
            order3.makeOrder(user4, storage6, station2);
            OrderDAO order6 = new OrderDAO();
            order3.makeOrder(user2, storage48, station0);
            OrderDAO order7 = new OrderDAO();
            order3.makeOrder(user2, storage47, station1);

            orderDAORepository.save(order1);
            orderDAORepository.save(order2);
            orderDAORepository.save(order3);
            orderDAORepository.save(order4);
            orderDAORepository.save(order5);
            orderDAORepository.save(order6);
            orderDAORepository.save(order7);

            DeliveryDAO delivery1 = new DeliveryDAO();
            delivery1.makeDelivery(order2, 3);
            DeliveryDAO delivery2 = new DeliveryDAO();
            delivery1.makeDelivery(order4, 1);

            deliveryDAORepository.save(delivery1);
            deliveryDAORepository.save(delivery2);

            StoreDAO store1 = new StoreDAO();
            store1.makeStore(user1, storage10);
            StoreDAO store2 = new StoreDAO();
            store2.makeStore(user4, storage11);

            storeDAORepository.save(store1);
            storeDAORepository.save(store2);

        }
    }
}
