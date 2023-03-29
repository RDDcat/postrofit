package com.postrofit.backend.Model.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="tbl_table")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StoreDAO {

    @Id
    private long storeId;

    // 보관함 회원 아이디
    long userId;

    // 보관함 아이디(FK)
    long storageId;
}
