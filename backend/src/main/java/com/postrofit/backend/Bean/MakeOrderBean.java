package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetStorageDAOBean;
import com.postrofit.backend.Bean.Small.GetUserDAOBean;
import com.postrofit.backend.Bean.Small.SaveOrderBean;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import com.postrofit.backend.Model.DTO.RequestMakeOrderDTO;
import com.postrofit.backend.Model.Enum.StorageStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MakeOrderBean {
    @Autowired
    GetUserDAOBean getUserDAOBean;
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    @Autowired
    SaveOrderBean saveOrderBean;
    public void exec(RequestMakeOrderDTO requestMakeOrderDTO){
        UserDAO userDAO = getUserDAOBean.exec(requestMakeOrderDTO);
        StorageDAO storageDAO = getStorageDAOBean.exec(requestMakeOrderDTO);


        OrderDAO orderDAO = new OrderDAO();
        orderDAO.makeOrder(userDAO, storageDAO);
        storageDAO.updateStat(StorageStat.WAIT); // 아마 더티체킹으로 저장되지 않을까?

        saveOrderBean.exec(orderDAO);
    }
}
