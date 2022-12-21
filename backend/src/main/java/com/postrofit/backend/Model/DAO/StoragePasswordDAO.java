package com.postrofit.backend.Model.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_storage_password")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoragePasswordDAO {

    @Id
    private long storagePasswordId;

    private long storageId;

    // 보관함 비밀번호(String)
    private String storagePassword;
}
