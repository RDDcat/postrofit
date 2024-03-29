package com.postrofit.backend.Model.DTO.History;

import com.postrofit.backend.Model.Enum.OrderStat;
import com.postrofit.backend.Model.Enum.StorageSize;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.sql.Timestamp;

@Data
public class OrderDTO implements HistoryDTO{
    long orderId;
    // 출발 역 이름
    String startStationName;

    // 도착 역 이름
    String endStationName;

    StorageSize size;

    // 맡길때 쓴 금액
    int price;

    // 주문시간
    Timestamp createAt;

    // 주문 상태
    @Enumerated(EnumType.STRING)
    OrderStat orderStat;
}
