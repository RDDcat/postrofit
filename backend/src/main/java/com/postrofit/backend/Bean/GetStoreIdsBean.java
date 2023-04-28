package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetStoreDAOBean;
import com.postrofit.backend.Bean.Small.GetStoreDAOsBean;
import com.postrofit.backend.Bean.Small.GetUserDAOBean;
import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import com.postrofit.backend.Model.DTO.ResponseStoreIdsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetStoreIdsBean {
    @Autowired
    GetUserDAOBean getUserDAOBean;
    @Autowired
    GetStoreDAOsBean getStoreDAOsBean;
    public ResponseStoreIdsDTO exec(long userId){
        UserDAO userDAO = getUserDAOBean.exec(userId);

        List<StoreDAO> storeDAOS = getStoreDAOsBean.exec(userId);

        List<Long> storeIds = new ArrayList<Long>();
        for(StoreDAO storeDAO : storeDAOS){
            storeIds.add(storeDAO.getStoreId());
        }


        // mapping
        ResponseStoreIdsDTO responseStoreIdsDTO = new ResponseStoreIdsDTO(storeIds);


        return responseStoreIdsDTO;
    }
}
