package com.postrofit.backend.Model.DAO;

import com.postrofit.backend.Model.Enum.StorageBrand;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_station")
@Data
public class StationDAO {

    @Id
    private int stationId;

    // 역 이름
    @Column
    private String  stationName;

    // 역 보관함 브랜드
    @Column
    private StorageBrand storageBrand;
}
