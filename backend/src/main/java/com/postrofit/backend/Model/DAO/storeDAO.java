package com.postrofit.backend.Model.DAO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_table")
@Data
public class storeDAO {

    @Id
    private long storeId;

    // 보관함 회원 아이디(FK)
    private long storageId;

    // 보관함 아이디(FK)
}
