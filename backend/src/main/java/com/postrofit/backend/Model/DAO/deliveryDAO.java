package com.postrofit.backend.Model.DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_delivery")
public class deliveryDAO {

    @Id @GeneratedValue
    private long deliveryId;

    // 배달 유저 아이디(FK)

    // 주문 아이디(FK)
}
