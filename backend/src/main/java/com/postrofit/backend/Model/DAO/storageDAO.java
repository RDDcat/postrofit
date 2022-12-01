package com.postrofit.backend.Model.DAO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_storage")
public class storageDAO {

    @Id
    private long storageId;

    // 역 아이디(FK)

    // 보관함 번호(int)

    // 보관함 상태(enum)

    // 보관함 상태 업데이트(timestamp)

    // 보관함 사이즈(enum)
}
