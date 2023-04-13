package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DTO.History.DeliveryDTO;
import com.postrofit.backend.Model.DTO.History.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetDeliveryDTOsBean {

    @Autowired
    GetDeliveryDTOBean getDeliveryDTOBean;


    public List<DeliveryDTO> exec(List<DeliveryDAO> deliveryDAOS) {
        List<DeliveryDTO> deliveryDTOS = new ArrayList<>();
        for (DeliveryDAO deliveryDAO:deliveryDAOS) {
            deliveryDTOS.add(getDeliveryDTOBean.exec(deliveryDAO));
        }

        return deliveryDTOS;
    }
}
