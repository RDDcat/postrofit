package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DTO.OrderCostDTO;
import org.springframework.stereotype.Component;

@Component
public class GetOrderCostDTOBean {
    public OrderCostDTO exec(String start, String end) {
        OrderCostDTO orderCostDTO = new OrderCostDTO();
        orderCostDTO.setSmallCost(2000);
        orderCostDTO.setMidCost(3000);
        return orderCostDTO;
    }
}
