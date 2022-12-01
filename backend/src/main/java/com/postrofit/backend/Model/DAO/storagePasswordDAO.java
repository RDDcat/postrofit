package com.postrofit.backend.Model.DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_storage_password")
public class storagePasswordDAO {

    @Id @GeneratedValue
    private long storagePasswordId;

    // 보관함 비밀번호(String)
}
