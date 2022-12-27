package com.postrofit.backend.Bean;

import com.postrofit.backend.Model.DTO.DeliveryCostDTO;
import org.springframework.stereotype.Component;

@Component
public class Delivery1Bean {
    public DeliveryCostDTO exec(String start, String end) {
        // TODO 출발역 도착역으로 사이즈별 예상 금액
        // TODO 이거 비용 알고리즘이 없음;;
        DeliveryCostDTO deliveryCostDTO = new DeliveryCostDTO();
        deliveryCostDTO.setMidCost(4000);
        deliveryCostDTO.setSmallCost(2500);

        return deliveryCostDTO;
    }
}
