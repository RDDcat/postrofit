package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetStationIdBean;
import com.postrofit.backend.Bean.Small.GetStationStorageStatBean;
import com.postrofit.backend.Bean.Small.GetStorageListBean;
import com.postrofit.backend.Model.DAO.storageDAO;
import com.postrofit.backend.Model.DTO.StationStorageStatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Store1Bean {

    @Autowired
    GetStationIdBean getStationIdBean;
    @Autowired
    GetStorageListBean getStorageListBean;
    @Autowired
    GetStationStorageStatBean getStationStorageStatBean;

    public StationStorageStatDTO exec(String start){

        // TODO 역 Id 가져오기
        String stationId = getStationIdBean.exec(start);

        // TODO 역 id로 보관함 전체가져오기
        List<storageDAO> storageDAOS = getStorageListBean.exec(stationId);

        // TODO 보관함 가능한(소, 중, 대) 개수 세고 StorageStatDTO로 변환
        StationStorageStatDTO stationStorageStatDTO = getStationStorageStatBean.exec(storageDAOS);

        return stationStorageStatDTO;
    }

}
