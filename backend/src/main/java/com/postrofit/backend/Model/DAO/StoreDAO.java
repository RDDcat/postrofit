package com.postrofit.backend.Model.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreDAO {

    @Id
    private long storeId;

    // 보관함 회원 아이디(FK)
    private long storageId;

    // 보관함 아이디(FK)
}
