package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.*;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import com.postrofit.backend.Model.DTO.History.StoreDTO;
import com.postrofit.backend.Model.DTO.StoreProfitDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetUserStoreBean {
    @Autowired
    GetUserDAOBean getUserDAOBean;
    @Autowired
    GetStoreDAOsBean getStoreDAOsBean;
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    @Autowired
    GetStationDAOBean getStationDAOBean;
    @Autowired
    GetStoreProfitBean getStoreProfitBean;

    @Transactional
    public List<StoreDTO> exec(long userId){
        // 현재 Store(보관) 정보 가져옴
        UserDAO userDAO = getUserDAOBean.exec(userId);
        List<StoreDAO> storeDAOs = getStoreDAOsBean.exec(userDAO);
        List<StoreDTO> storeDTOs = new ArrayList<>();

        for(StoreDAO storeDAO:storeDAOs){
            // Storage 가져옴
            StorageDAO storageDAO = getStorageDAOBean.exec(storeDAO);

            // Station 가져옴
            StationDAO stationDAO = getStationDAOBean.exec(storageDAO);

            // Station, Storage로 브랜드, 사이즈별 비용 계산
            StoreProfitDTO storeProfitDTO = getStoreProfitBean.exec(stationDAO, storageDAO);

            storeDTOs.add(new StoreDTO(stationDAO, storeDAO, storeProfitDTO));
        }

        // 리턴
        return storeDTOs;
    }
}
