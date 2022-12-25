package com.postrofit.backend.Model.DAO;

import com.postrofit.backend.Model.Enum.StorageBrand;
import com.postrofit.backend.Model.Enum.StorageStat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="tbl_station")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StationDAO {

    @Id
    private int stationId;

    // 역 이름
    @Column
    private String  stationName;

    // 역 보관함 브랜드
    @Enumerated(EnumType.STRING)
    StorageBrand storageBrand;
}
