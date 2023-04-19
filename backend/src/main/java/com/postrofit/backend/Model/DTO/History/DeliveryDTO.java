package com.postrofit.backend.Model.DTO.History;

import com.postrofit.backend.Model.Enum.OrderStat;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.sql.Timestamp;

@Data
public class DeliveryDTO implements HistoryDTO{
    long deliveryId;
    // 출발 역 이름
    String startStationName;

    // 도착 역 이름
    String endStationName;

    // 배달하며 번 금액
    int price;

    // 배달 승낙 시간
    Timestamp createAt;
    // 배달 승낙 시간
    Timestamp finishedAt;

    // 배달의 주문 상태
    @Enumerated(EnumType.STRING)
    OrderStat orderStat;

}
