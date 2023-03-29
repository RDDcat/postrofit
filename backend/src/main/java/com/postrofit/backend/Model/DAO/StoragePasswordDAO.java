package com.postrofit.backend.Model.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="tbl_storage_password")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StoragePasswordDAO {

    @Id
    private long storagePasswordId;

    long storageId;

    // 보관함 비밀번호(String)
    private String storagePassword;
}
