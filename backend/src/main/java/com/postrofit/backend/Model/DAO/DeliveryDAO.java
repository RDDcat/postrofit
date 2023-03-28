package com.postrofit.backend.Model.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="tbl_delivery")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeliveryDAO {

    @Id @GeneratedValue
    private long deliveryId;

//    // 배달 유저 아이디(FK) 주인
//    @ManyToOne
//    UserDAO userDAO;
//
//    // 주문 아이디(FK) 주인아님(Read Only)
//    @OneToOne(mappedBy = "deliveryDAO", fetch = FetchType.LAZY)
//    OrderDAO orderDAO;
//
//
//    // 시간
//
//    // 도착보관함 아이디(FK) 주인
//    @OneToOne
//    @JoinColumn(name = "STORAGE_ID")
//    StorageDAO storageDAO;

}
