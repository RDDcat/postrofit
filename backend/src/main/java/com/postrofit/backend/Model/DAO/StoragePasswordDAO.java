package com.postrofit.backend.Model.DAO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_storage_password")
@Data
public class StoragePasswordDAO {

    @Id @GeneratedValue
    private long storagePasswordId;

    // 보관함 비밀번호(String)
    private String storagePassword;
}
