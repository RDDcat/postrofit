package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetStorageDAOBean;
import com.postrofit.backend.Bean.Small.GetUserDAOBean;
import com.postrofit.backend.Bean.Small.SaveStoreBean;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import com.postrofit.backend.Model.DTO.RequestStoreDTO;
import com.postrofit.backend.Model.DTO.ResponseStorePostDTO;
import com.postrofit.backend.Model.Enum.StorageStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MakeStoreBean {
    @Autowired
    GetUserDAOBean getUserDAOBean;
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    @Autowired
    SaveStoreBean saveStoreBean;

    @Transactional
    public ResponseStorePostDTO exec(RequestStoreDTO requestStoreDTO){
        UserDAO userDAO = getUserDAOBean.exec(requestStoreDTO);
        StorageDAO storageDAO = getStorageDAOBean.exec(requestStoreDTO);


        StoreDAO storeDAO = new StoreDAO();
        storeDAO.makeStore(userDAO, storageDAO);
        storageDAO.updateStat(StorageStat.STORE); // 아마 더티체킹으로 저장되지 않을까?

        saveStoreBean.exec(storeDAO);

        // mapping
        ResponseStorePostDTO responseStorePostDTO = new ResponseStorePostDTO(storeDAO);

        return responseStorePostDTO;
    }
}
