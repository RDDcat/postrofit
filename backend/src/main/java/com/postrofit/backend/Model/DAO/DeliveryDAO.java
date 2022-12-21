package com.postrofit.backend.Model.DAO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_delivery")
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryDAO {

    @Id @GeneratedValue
    private long deliveryId;

    // 배달 유저 아이디(FK)

    // 주문 아이디(FK)
}
