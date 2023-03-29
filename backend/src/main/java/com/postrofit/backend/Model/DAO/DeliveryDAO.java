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

    long userId;
    long orderId;
    // 도착보관함 아이디
    private long storageId;
    // 배달 승낙 시간
    Date createAt;
    // 배달 승낙 시간
    Date finishedAt;


}
