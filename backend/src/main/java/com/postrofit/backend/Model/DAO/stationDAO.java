package com.postrofit.backend.Model.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_station")
public class stationDAO {

    @Id
    private int stationId;

    // 역 이름
    @Column
    private String  stationName;
}
