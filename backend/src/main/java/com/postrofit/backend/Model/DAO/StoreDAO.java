package com.postrofit.backend.Model.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="tbl_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreDAO {

    @Id
    private long storeId;

    // 보관함 회원 아이디(FK)
//    @ManyToOne
//    UserDAO userDAO;
//
//    // 보관함 아이디(FK)
//    @OneToOne
//    @JoinColumn(name = "STORAGE_ID")
//    StorageDAO storageDAO;
}
