package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetDeliveryDAOBean;
import com.postrofit.backend.Bean.Small.GetOrderDAOBean;
import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Delivery3Bean {
    @Autowired
    GetDeliveryDAOBean getDeliveryDAOBean;
    @Autowired
    GetOrderDAOBean getOrderDAOBean;

    public StoragePasswordDTO exec(String _userId){
        // 딜리버리 쪽에서 요청이 들어와야함
        // 유저 아이디 가져와서 주문 확인하고 도착역 이름, 사물함 번호, 비밀번호 리턴
        // TODO 유저 아이디 long 으로 형변환
        long userId = Long.parseLong(_userId);

        // TODO 유저 아이디로 배달 확인 확인
        DeliveryDAO deliveryDAO = getDeliveryDAOBean.exec(userId);

        // TODO 주문 아이디로 주문 DAO 가져오기
        OrderDAO orderDAO = getOrderDAOBean.exec(deliveryDAO);

        // TODO 주문 DAO에서 도착역 이름을 리턴할 곳에 넣음
        StoragePasswordDTO storagePasswordDTO = new StoragePasswordDTO();
        storagePasswordDTO.setStationName(null);

        // TODO 주문 DAO에서 도착 보관함 아이디 가져오기

        // TODO 도착 보관함 아이디로 도착 보관함 DAO 가져오기

        // TODO 도착 보관함 DAO에서 사물함 번호 가져오기

        // TODO 도착 보관함 아이디로 비밀번호 가져오기

        // TODO 비밀번호 리턴 클래스에 담기


        return storagePasswordDTO;
    }
}
