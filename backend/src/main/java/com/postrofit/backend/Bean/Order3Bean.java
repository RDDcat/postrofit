package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.*;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoragePasswordDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Order3Bean {
    @Autowired
    GetUserDAOBean getUserDAOBean;
    @Autowired
    GetOrderDAOBean getOrderDAOBean;
    @Autowired
    GetStationIdBean getStationIdBean;
    @Autowired
    GetStoragePasswordBean getStoragePasswordBean;
    @Autowired
    GetStorageDAOBean getStorageDAOBean;

    public StoragePasswordDTO exec(long userId){
        // 사용자 아이디 받아다가 주문 확인해서 보관함 비밀번호 가져오는거
        // TODO userId로 UserDAO가져오기
        UserDAO userDAO = getUserDAOBean.exec(userId);

        // TODO 주문확인
        OrderDAO order = getOrderDAOBean.exec(userDAO);
        
        // TODO orderDAO에서 출발 보관함 id 가져오기
        StorageDAO storageDAO = getStorageDAOBean.exec(order);

        // TODO 보관함 id로 보관함 비번 조회
        StoragePasswordDTO storagePassword = getStoragePasswordBean.exec(storageDAO);

        // TODO 결과리턴
        return storagePassword;
    }
}
