package com.postrofit.backend.Model.DAO;

import com.postrofit.backend.Model.Enum.OrderStat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Table(name="tbl_order")
@AllArgsConstructor
@NoArgsConstructor
public class OrderDAO {

    @Id @GeneratedValue
    private long orderId;

    long deliveryId;

    // 맡긴 유저 아이디
    long userId;

    // 주문시간
    Date createAt;

    // 출발 보관함 아이디
    long storageId;

    // 주문 상태
    @Enumerated(EnumType.STRING)
    OrderStat orderStat;

    public void addDelivery(DeliveryDAO delivery){
        this.deliveryId =delivery.getDeliveryId();
    }

    @Transactional
    public void makeOrder(StorageDAO storageDAO, UserDAO userDAO){
        this.orderStat = OrderStat.WAIT;
        this.storageId =storageDAO.getStorageId();
        this.userId = userDAO.getUserId();

    }

}
