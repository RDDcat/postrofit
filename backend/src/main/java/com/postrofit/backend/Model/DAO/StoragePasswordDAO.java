package com.postrofit.backend.Model.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="tbl_storage_password")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoragePasswordDAO {

    @Id
    private long storagePasswordId;

//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "storagePasswordDAO")
//    StorageDAO storageDAO;

    // 보관함 비밀번호(String)
    private String storagePassword;
}
