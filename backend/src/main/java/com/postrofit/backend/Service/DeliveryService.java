package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.*;
import com.postrofit.backend.Model.DTO.*;
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
    @Autowired
    GetStartStoragePassword getStartStoragePassword;
    @Autowired
    GetDeliveryOrderCount getDeliveryOrderCount;
    @Autowired
    GetOrderStorageInfo getOrderStorageInfo;

    public DeliveryCostDTO getDeliveryCost(String start, String end) {
        return delivery1Bean.exec(start, end);
    }

    // 배달 주문 받고 보관함 비밀번호 리턴
    public StoragePasswordDTO takeOrder(RequestTakeOrderDTO requestTakeOrderDTO) {
        return takeOrderBean.exec(requestTakeOrderDTO);
    }

    public StoragePasswordDTO delivery3(String orderId) {
        return delivery3Bean.exec(orderId);

    }

    public StoragePasswordDTO delivery3(RequestEndStoragePasswordDTO requestEndStoragePasswordDTO) {
        return delivery3Bean.exec(requestEndStoragePasswordDTO);
    }

    public List<StorageStatDTO> getStorageList(String start, String end) {
        return getDeliveryStorageListBean.exec(start, end);
    }

    public StoragePasswordDTO getStartStoragePassword(RequestStartStoragePasswordDTO requestStartStoragePasswordDTO) {
        return getStartStoragePassword.exec(requestStartStoragePasswordDTO);
    }


    public DeliveryCountDTO getDeliveryCountDTO(RequestStartEndDTO requestStartEndDTO) {
        return getDeliveryOrderCount.exec(requestStartEndDTO);
    }

    public ResponseDeliveryOrderStorageDTO getOrderStorageInfo(long storageId) {
        return getOrderStorageInfo.exec(storageId);
    }


}
