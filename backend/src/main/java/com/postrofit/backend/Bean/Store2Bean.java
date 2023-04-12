package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetStationDAOBean;
import com.postrofit.backend.Bean.Small.GetStorageSizeBean;
import com.postrofit.backend.Bean.Small.GetStoreProfitBean;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DTO.StoreProfitDTO;
import com.postrofit.backend.Model.Enum.StorageBrand;
import com.postrofit.backend.Model.Enum.StorageSize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Store2Bean {
    @Autowired
    GetStoreProfitBean getStoreProfitBean;
    @Autowired
    GetStationDAOBean getStationDAOBean;
    @Autowired
    GetStorageSizeBean getStorageSizeBean;

    public StoreProfitDTO exec(String start, String size){

        // TODO 역 이름으로 역 DAO 가져오기
        StationDAO stationDAO = getStationDAOBean.exec(start);

        // TODO 역 DAO에서 브랜드 이름 가져오기
        StorageBrand brand = stationDAO.getStorageBrand();

        StorageSize storageSize = getStorageSizeBean.exec(size);

        // TODO 기본 시간, 기본 가격 가져오기
        StoreProfitDTO storeProfitDTO = getStoreProfitBean.exec(brand, storageSize);


        return storeProfitDTO;
    }
}
