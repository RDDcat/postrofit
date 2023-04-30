package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DTO.RequestDeliveryStoragePasswordDTO;
import com.postrofit.backend.Model.DTO.RequestEndStoragePasswordDTO;
import com.postrofit.backend.Model.DTO.RequestHistoryDetailDTO;
import com.postrofit.backend.Repository.DeliveryDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetDeliveryDAOBean {
    @Autowired
    DeliveryDAORepository deliveryDAORepository;

    // TODO 유저 ID를 가지고 Delivery DAO를 가져옴
    public DeliveryDAO exec(long orderId) {
        // null 예외처리 해줘야함
        return deliveryDAORepository.findDeliveryDAOByOrderId(orderId);
    }
    public DeliveryDAO exec(RequestEndStoragePasswordDTO requestEndStoragePasswordDTO) {
        long orderId = Long.parseLong(requestEndStoragePasswordDTO.getOrderId());
        // null 예외처리 해줘야함
        return deliveryDAORepository.findDeliveryDAOByOrderId(orderId);
    }
    public DeliveryDAO exec(RequestHistoryDetailDTO requestHistoryDetailDTO) {
        return deliveryDAORepository.findById(requestHistoryDetailDTO.getDeliveryId()).orElse(null);
    }

    public DeliveryDAO exec(RequestDeliveryStoragePasswordDTO requestStartStoragePasswordDTO) {
        return deliveryDAORepository.findById(requestStartStoragePasswordDTO.getDeliveryId()).orElse(null);
    }
}
