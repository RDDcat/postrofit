package com.postrofit.backend.Model.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

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

    Date createAt;

    public void makeStore(UserDAO user1, StorageDAO storageDAO) {
        this.userId = user1.getUserId();
        this.storageId = storageDAO.getStorageId();
        this.createAt = new Date(System.currentTimeMillis());
    }
}
