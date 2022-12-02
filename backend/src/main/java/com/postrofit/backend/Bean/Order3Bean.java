package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetOrderDAOBean;
import com.postrofit.backend.Bean.Small.GetStationIdBean;
import com.postrofit.backend.Bean.Small.GetStoragePasswordBean;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order3Bean {
    @Autowired
    GetOrderDAOBean getOrderDAOBean;
    @Autowired
    GetStationIdBean getStationIdBean;
    @Autowired
    GetStoragePasswordBean getStoragePasswordBean;

    public StoragePasswordDTO exec(String userId){
        // 사용자 아이디 받아다가 주문 확인해서 보관함 비밀번호 가져오는거
        // TODO 주문확인
        OrderDAO order = getOrderDAOBean.exec(userId);
        
        // TODO orderDAO에서 출발 보관함 id 가져오기
        long storageId = getStationIdBean.exec(order);

        // TODO 보관함 id로 보관함 비번 조회
        StoragePasswordDTO storagePassword = getStoragePasswordBean.exec(storageId);

        // TODO 결과리턴
        return storagePassword;
    }
}
