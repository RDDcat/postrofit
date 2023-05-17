package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetOrderDAOBean;
import com.postrofit.backend.Bean.Small.CreateDeliveryBean;
import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DTO.RequestTakeOrderDTO;
import com.postrofit.backend.Model.Enum.OrderStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TakeOrderBean {
    GetOrderDAOBean getOrderDAOBean;
    CreateDeliveryBean createDeliveryBean;

    @Autowired
    public TakeOrderBean(GetOrderDAOBean getOrderDAOBean, CreateDeliveryBean createDeliveryBean) {
        this.getOrderDAOBean = getOrderDAOBean;
        this.createDeliveryBean = createDeliveryBean;
    }


    @Transactional
    public DeliveryDAO exec(RequestTakeOrderDTO requestTakeOrderDTO){
        // 맡겨둔 주문 확인후 해당 유저가 배달주문 점유
        // TODO 오더에 딜리버리 추가
        OrderDAO orderDAO = getOrderDAOBean.exec(requestTakeOrderDTO);

        // 유효성 검사
        if(orderDAO.getOrderStat()!= OrderStat.WAIT){
            // 배달 등록 실패

            return null;
        }

        // TODO 딜리버리 추가
        return createDeliveryBean.exec(orderDAO, requestTakeOrderDTO.getUserId());
    }
}
