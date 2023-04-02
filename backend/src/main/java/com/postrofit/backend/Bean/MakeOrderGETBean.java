package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetStorageIdBean;
import com.postrofit.backend.Bean.Small.GetUserDAOBean;
import com.postrofit.backend.Bean.Small.SaveOrderBean;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import com.postrofit.backend.Model.Enum.StorageStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MakeOrderGETBean {
    @Autowired
    GetStorageIdBean getStorageIdBean;
    @Autowired
    GetUserDAOBean getUserDAOBean;
    @Autowired
    SaveOrderBean saveOrderBean;

    public void exec(long userId, String stationName, int storageNum) {
        // userId로 UserDAO 알아냄
        UserDAO userDAO = getUserDAOBean.exec(userId);

        // 역 이름이랑 보관함 번호로 보관함 id 알아냄
        StorageDAO storageDAO = getStorageIdBean.exec(stationName, storageNum);

        // 유저 아이디랑 보관함 번호를 저장하고, order_stat 초기값 delivery id는 null 로 디비에 저장
        OrderDAO order = new OrderDAO();
//        order.makeOrder(userDAO, storageDAO);
        storageDAO.updateStat(StorageStat.WAIT);

        saveOrderBean.exec(order, storageDAO);
    }
}
