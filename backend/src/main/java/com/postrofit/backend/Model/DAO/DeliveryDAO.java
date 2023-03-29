package com.postrofit.backend.Model.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="tbl_delivery")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeliveryDAO {

    @Id @GeneratedValue
    private long deliveryId;

    // 배달 유저 아이디
    long userId;
    long orderId;
    // 도착보관함 아이디
    long storageId;
    // 배달 승낙 시간
    Date createAt;
    // 배달 승낙 시간
    Date finishedAt;

    public void makeDelivery(UserDAO userDAO, OrderDAO orderDAO, StorageDAO storageDAO){
        this.userId = userDAO.getUserId();
        this.orderId = orderDAO.getOrderId();
        this.storageId = storageDAO.getStorageId();
        orderDAO.addDelivery(this);
    }

    public void makeDelivery(OrderDAO orderDAO){
        this.userId = orderDAO.getUserId();
        this.orderId = orderDAO.getOrderId();
        this.storageId = orderDAO.getStorageId();
        orderDAO.addDelivery(this);
    }
}
