package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.DeliveryCountDTO;
import com.postrofit.backend.Model.Enum.StorageSize;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class GetDeliveryCountDTO {
    @Autowired
    GetStorageDAOBean getStorageDAOBean;
    public DeliveryCountDTO exec(List<OrderDAO> orderDAOS) {
        DeliveryCountDTO deliveryCountDTO = new DeliveryCountDTO();
        int smallCount = 0;
        int midCount = 0;

        for(OrderDAO orderDAO: orderDAOS){
            StorageDAO storageDAO = getStorageDAOBean.exec(orderDAO);
            if(storageDAO.getStorageSize() == StorageSize.SMALL){
                smallCount++;
            }
            else if(storageDAO.getStorageSize() == StorageSize.MID){
                midCount++;
            }
            else{
                log.error("버그다! 메인 화면에서 배달가능한 오더 수 보여주는 곳에서 예외발생!");
            }
        }

        deliveryCountDTO.setSmallCount(smallCount);
        deliveryCountDTO.setMidCount(midCount);

        return deliveryCountDTO;
    }
}
