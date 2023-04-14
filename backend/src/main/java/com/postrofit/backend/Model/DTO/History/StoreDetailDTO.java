package com.postrofit.backend.Model.DTO.History;

import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Model.Enum.OrderStat;
import com.postrofit.backend.Model.Enum.StoreStat;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class StoreDetailDTO implements HistoryDetailDTO {
    // 서비스 종류
    String service;
    // 요청 시간
    Timestamp createAt;
//    Timestamp finishedAt;

    // 배송상태
    StoreStat stat;

    // 이거 삭제하고 빈으로 돌려야할듯
    public void makeStoreDetailDTO(StoreDAO storeDAO) {
        this.service = "store";
        this.createAt = storeDAO.getCreateAt();
        this.stat = storeDAO.getStoreStat();
    }
}
