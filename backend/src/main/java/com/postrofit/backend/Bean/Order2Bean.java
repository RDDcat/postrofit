package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetOrderCostDTOBean;
import com.postrofit.backend.Model.DTO.OrderCostDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Order2Bean {
    @Autowired
    GetOrderCostDTOBean getOrderCostDTOBean;
    public OrderCostDTO exec(String start, String end){
        // 출발역 도착역 사이즈 받아다가 배달비용 계산
        // TODO 배달비용 계산
        log.info("배달비용 계산 : " + start + end);
        OrderCostDTO orderCostDTO = getOrderCostDTOBean.exec(start, end);

        return orderCostDTO;
    }
}
