package com.postrofit.backend.Model.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name="tbl_table")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StoreDAO {

    @Id @GeneratedValue
    private long storeId;

    // 보관함 회원 아이디
    long userId;

    // 보관함 아이디(FK)
    long storageId;

    Timestamp createAt;

    public void makeStore(UserDAO user1, StorageDAO storageDAO) {
        this.userId = user1.getUserId();
        this.storageId = storageDAO.getStorageId();
        this.createAt = new Timestamp(System.currentTimeMillis());
    }
}
