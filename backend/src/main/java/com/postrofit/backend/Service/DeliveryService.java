package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.Delivery1Bean;
import com.postrofit.backend.Bean.Small.GetDeliveryStorageListBean;
import com.postrofit.backend.Bean.TakeOrderBean;
import com.postrofit.backend.Bean.Delivery3Bean;
import com.postrofit.backend.Model.DTO.DeliveryCostDTO;
import com.postrofit.backend.Model.DTO.RequestTakeOrderDTO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {
    @Autowired
    Delivery1Bean delivery1Bean;
    @Autowired
    TakeOrderBean takeOrderBean;
    @Autowired
    Delivery3Bean delivery3Bean;
    @Autowired
    GetDeliveryStorageListBean getDeliveryStorageListBean;

    public DeliveryCostDTO getDeliveryCost(String start, String end) {
        return delivery1Bean.exec(start, end);
    }

    // 배달 주문 받고 보관함 비밀번호 리턴
    public StoragePasswordDTO takeOrder(RequestTakeOrderDTO requestTakeOrderDTO) {
        return takeOrderBean.exec(requestTakeOrderDTO);
    }

    public StoragePasswordDTO delivery3(String userId) {
        return delivery3Bean.exec(userId);

    }

    public List<StorageStatDTO> getStorageList(String start, String end) {
        return getDeliveryStorageListBean.exec(start, end);
    }
}
