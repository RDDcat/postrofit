package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.*;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoragePasswordDAO;
import com.postrofit.backend.Model.DTO.StorageDetailDTO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetUserStoreDetailBean {
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    @Autowired
    GetStorageStatDTOBean getStorageStatDTOBean;
    @Autowired
    GetStationDAOBean getStationDAOBean;
    @Autowired
    GetStoragePasswordDAOBean getStoragePasswordDAOBean;
    @Autowired
    GetStorageDAOsBean getStorageDAOsBean;
    @Autowired
    GetStorageStatDTOsBean getStorageStatDTOsBean;
    @Autowired
    CleanStatStorageStatDTOBean cleanStatStorageStatDTOBean;
    @Autowired
    SetStorageStatDTOByOrderBean setStorageStatDTOByOrderBean;

    public StorageDetailDTO exec(long storageId){
        StorageDAO storageDAO = getStorageDAOBean.exec(storageId);
        StationDAO stationDAO = getStationDAOBean.exec(storageDAO);
        StoragePasswordDAO storagePasswordDAO = getStoragePasswordDAOBean.exec(storageDAO);

        StorageStatDTO storageStatDTO = getStorageStatDTOBean.exec(storageDAO);

        List<StorageDAO> StorageDAOS = getStorageDAOsBean.exec(stationDAO);

        List<StorageStatDTO> storageStatDTOS = getStorageStatDTOsBean.exec(StorageDAOS);


        // 주문에 적힌 스토리지만 WAIT 상태고 나머지는 empty 상태 넣어주기
        storageStatDTOS = cleanStatStorageStatDTOBean.exec(storageStatDTOS);
        storageStatDTOS = setStorageStatDTOByOrderBean.exec(storageStatDTOS, storageStatDTO);


        StoragePasswordDTO storagePasswordDTO = new StoragePasswordDTO();
        storagePasswordDTO.setStoragePasswordDTO(stationDAO, storageDAO, storagePasswordDAO);

        StorageDetailDTO storageDetailDTO = new StorageDetailDTO();
        storageDetailDTO.setStorageDetailDTO(storageStatDTO, storagePasswordDTO, storageStatDTOS);


        return storageDetailDTO;
    }
}
