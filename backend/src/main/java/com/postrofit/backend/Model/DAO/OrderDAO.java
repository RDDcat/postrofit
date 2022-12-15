package com.postrofit.backend.Model.DAO;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name="tbl_order")
public class OrderDAO {

    @Id @GeneratedValue
    private long orderId;

    // 맡긴 유저 아이디

    // 출발역
    long startStationId;

    // 도착역
    long endStationId;

    // 주문시간

    // 출발 보관함 아이디(FK)
    long startStorageId;

    // 도착 보관함 아이디(FK)
    long endStorageId;

    // 주문 상태
}
