package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.*;
import com.postrofit.backend.Model.DAO.*;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Delivery3Bean {
    @Autowired
    GetDeliveryDAOBean getDeliveryDAOBean;
    @Autowired
    GetOrderDAOBean getOrderDAOBean;
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    @Autowired
    GetStationDAOBean getStationDAOBean;
    @Autowired
    GetStoragePasswordDAOBean getStoragePasswordDAOBean;

    public StoragePasswordDTO exec(String _userId){
        // 딜리버리 쪽에서 요청이 들어와야함
        // 유저 아이디 가져와서 주문 확인하고 도착역 이름, 사물함 번호, 비밀번호 리턴
        // TODO 유저 아이디 long 으로 형변환
        long userId = Long.parseLong(_userId);

        // TODO 유저 아이디로 배달 확인 확인
        DeliveryDAO deliveryDAO = getDeliveryDAOBean.exec(userId);

        // TODO 주문 아이디로 주문 DAO 가져오기
        OrderDAO orderDAO = getOrderDAOBean.exec(deliveryDAO);

        //
        StorageDAO storageDAO = getStorageDAOBean.exec(deliveryDAO);
        StationDAO stationDAO = getStationDAOBean.exec(storageDAO);
        StoragePasswordDAO storagePasswordDAO = getStoragePasswordDAOBean.exec(storageDAO);

        // 리턴 DTO 생성
        StoragePasswordDTO storagePasswordDTO = new StoragePasswordDTO();
        storagePasswordDTO.setStoragePasswordDTO(stationDAO, storageDAO, storagePasswordDAO);

        return storagePasswordDTO;
    }
}











