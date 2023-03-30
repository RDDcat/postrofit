package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetOrderDAOBean;
import com.postrofit.backend.Bean.Small.CreateDeliveryBean;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DTO.RequestTakeOrderDTO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TakeOrderBean {
    GetOrderDAOBean getOrderDAOBean;
    CreateDeliveryBean createDeliveryBean;

    @Autowired
    public TakeOrderBean(GetOrderDAOBean getOrderDAOBean, CreateDeliveryBean createDeliveryBean) {
        this.getOrderDAOBean = getOrderDAOBean;
        this.createDeliveryBean = createDeliveryBean;
    }

    public StoragePasswordDTO exec(RequestTakeOrderDTO requestTakeOrderDTO){
        // 맡겨둔 주문 확인후 해당 유저가 배달주문 점유
        // TODO 오더에 딜리버리 추가 (유효성 검사?)
        OrderDAO orderDAO = getOrderDAOBean.exec(requestTakeOrderDTO);

        // TODO 딜리버리 추가
        createDeliveryBean.exec(orderDAO, requestTakeOrderDTO.getUserId());
        
        // TODO 잡은 배달 주문에서 보관함 아이디 가져오기

        
        // TODO 가져온 보관함 아이디로 비밀번호 가져오기

        return null;
    }
}
