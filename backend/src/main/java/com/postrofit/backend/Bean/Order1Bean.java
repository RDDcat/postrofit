package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetStationIdBean;
import com.postrofit.backend.Bean.Small.GetStorageListBean;
import com.postrofit.backend.Bean.Small.GetStorageStatDTOBean;
import com.postrofit.backend.Model.DAO.storageDAO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Order1Bean {

    @Autowired
    GetStationIdBean getStationIdBean;
    @Autowired
    GetStorageListBean getStorageListBean;
    @Autowired
    GetStorageStatDTOBean getStorageStatDTOBean;

    public List<StorageStatDTO> exec(String start){
        // 시작역 이름과 도착역 이름 정보로 배달가격 산정
        // TODO 역 id 가져오기
        String stationId = getStationIdBean.exec(start);

        // TODO 역 id로 보관함 전체가져오기
        List<storageDAO> storageDAOS = getStorageListBean.exec(stationId);

        // TODO 보관함 전체를 상태값만 가진 DTO로 변경
        List<StorageStatDTO> storageStatDTOS = getStorageStatDTOBean.exec(storageDAOS);

        // TODO 결과리턴
        return storageStatDTOS;
    }
}












