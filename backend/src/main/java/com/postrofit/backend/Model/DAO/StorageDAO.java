package com.postrofit.backend.Model.DAO;

import com.postrofit.backend.Model.Enum.StorageSize;
import com.postrofit.backend.Model.Enum.StorageStat;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="tbl_storage")
@Data
public class StorageDAO {

    @Id
    private long storageId;

    // 역 아이디(FK)
    long stationId;

    // 보관함 번호(int)
    int storageNumber;

    // 보관함 상태(enum)
    StorageStat storageStat;

    // 보관함 상태 업데이트(timestamp)
    Timestamp timestamp;

    // 보관함 사이즈(enum)
    @Enumerated(EnumType.STRING)
    StorageSize storageSize;
}
