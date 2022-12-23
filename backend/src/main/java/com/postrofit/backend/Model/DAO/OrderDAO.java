package com.postrofit.backend.Model.DAO;

import com.postrofit.backend.Model.Enum.OrderStat;
import com.postrofit.backend.Model.Enum.StorageStat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Table(name="tbl_order")
@AllArgsConstructor
@NoArgsConstructor
public class OrderDAO {

    @Id @GeneratedValue
    private long orderId;

    // 배달과의 연관관계 주인
    @OneToOne
    @JoinColumn(name = "DELIVERY_ID")
    DeliveryDAO deliveryDAO;

    // 맡긴 유저 아이디
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    UserDAO userDAO;

    // 주문시간

    // 출발 보관함 아이디(FK)
    @OneToOne
    @JoinColumn(name = "STORAGE_ID")
    StorageDAO storageDAO;

    // 주문 상태
    @Enumerated(EnumType.STRING)
    OrderStat orderStat;

    public void addDelivery(DeliveryDAO delivery){
        this.deliveryDAO =delivery;
    }

}
