package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.*;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetDeliveryStorageListBean {
    @Autowired
    GetWaitingOrderBean getWaitingOrderBean;
    @Autowired
    GetStationDAOBean getStationDAOBean;
    @Autowired
    GetStorageListBean getStorageListBean;
    @Autowired
    GetStorageStatDTOsBean getStorageStatDTOsBean;
    @Autowired
    CleanStatStorageStatDTOBean cleanStatStorageStatDTOBean;
    @Autowired
    SetStorageStatDTOByOrderBean setStorageStatDTOByOrderBean;

    public List<StorageStatDTO> exec(String start, String end){
        // 옮길게요 들어온 사람한테만 보여주기 동시성 어케 해결하지..?
        // 다른사람 못들어오게 데이터 업데이트

        // 역 정보 가져오기
        StationDAO startStationDAO = getStationDAOBean.exec(start);
        StationDAO endStationDAO = getStationDAOBean.exec(end);

        // Wait 상태인거 1개 골라오기
        OrderDAO orderDAO = getWaitingOrderBean.exec(startStationDAO, endStationDAO);

        // 그 역의 보관함 전체 리스트 가져오기 (사이즈랑 번호 필요)
        StationDAO stationDAO = getStationDAOBean.exec(start);
        List<StorageDAO> StorageDAOS = getStorageListBean.exec(stationDAO);
        List<StorageStatDTO> storageStatDTOS = getStorageStatDTOsBean.exec(StorageDAOS);


        // 주문에 적힌 스토리지만 WAIT 상태고 나머지는 empty 상태 넣어주기
        storageStatDTOS = cleanStatStorageStatDTOBean.exec(storageStatDTOS);
        storageStatDTOS = setStorageStatDTOByOrderBean.exec(storageStatDTOS, orderDAO);

        return storageStatDTOS;
    }
}
