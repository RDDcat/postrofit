package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetOrderDAOBean;
import com.postrofit.backend.Bean.Small.MakeOrderBean;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Delivery2Bean {
    @Autowired
    GetOrderDAOBean getOrderDAOBean;
    @Autowired
    MakeOrderBean makeOrderBean;

    public StoragePasswordDTO exec(String start, String end, String userId){
        // 맡겨둔 주문 확인후 해당 유저가 배달주문 점유
        // TODO 출발 도착역으로 주문 확인
        OrderDAO orderDAO = getOrderDAOBean.exec(start, end, userId);

        // TODO 유저 아이디를 long값으로 변경
        long orderId = orderDAO.getOrderId();

        // TODO 유저 아이디로 배달 주문 배치
        makeOrderBean.exec();
        
        // TODO 잡은 배달 주문에서 보관함 아이디 가져오기
        
        // TODO 가져온 보관함 아이디로 비밀번호 가져오기

        return null;
    }
}
