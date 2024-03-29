package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetEmptyStorageCountDTOBean;
import com.postrofit.backend.Bean.Small.GetStationDAOBean;
import com.postrofit.backend.Bean.Small.GetStorageDAOsBean;
import com.postrofit.backend.Bean.Small.GetStoreProfitBean;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.EmptyStorageCountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetEmptyStorageCount {
    @Autowired
    GetStationDAOBean getStationDAOBean;
    @Autowired
    GetStorageDAOsBean getStorageDAOsBean;
    @Autowired
    GetEmptyStorageCountDTOBean getEmptyStorageCountDTOBean;
    @Autowired
    GetStoreProfitBean getStoreProfitBean;

    public EmptyStorageCountDTO exec(String stationName) {
        StationDAO stationDAO = getStationDAOBean.exec(stationName);
        List<StorageDAO> storageDAOS = getStorageDAOsBean.exec(stationDAO);

        EmptyStorageCountDTO emptyStorageCountDTO = getEmptyStorageCountDTOBean.exec(storageDAOS);

        return emptyStorageCountDTO;
    }
}
