package com.postrofit.backend.Model.DAO;

import com.postrofit.backend.Model.Enum.StorageSize;
import com.postrofit.backend.Model.Enum.StorageStat;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name="tbl_storage")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StorageDAO {

    @Id
    private long storageId;

    // 역 아이디
    long stationId;
    long storagePasswordId;
    // 보관함 번호(int)
    int storageNumber;
    // 보관함 상태(enum)
    @Enumerated(EnumType.STRING)
    StorageStat storageStat;
    // 보관함 상태 업데이트(timestamp)
    Date updateAt;

    // 보관함 사이즈(enum)
    @Enumerated(EnumType.STRING)
    StorageSize storageSize;

    public void updateStat(StorageStat storageStat){
        this.storageStat = storageStat;
    }

}
