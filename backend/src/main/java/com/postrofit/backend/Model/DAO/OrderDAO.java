package com.postrofit.backend.Model.DAO;

import javax.persistence.*;

@Entity
@Table(name="tbl_order")
public class OrderDAO {

    @Id @GeneratedValue
    private long orderId;

    // 맡긴 유저 아이디

    // 출발역

    // 도착역

    // 주문시간

    // 출발 보관함 아이디(FK)

    // 도착 보관함 아이디(FK)

    // 주문 상태
}
