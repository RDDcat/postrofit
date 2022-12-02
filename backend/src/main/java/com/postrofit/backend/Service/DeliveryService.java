package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.Delivery1Bean;
import com.postrofit.backend.Bean.Delivery2Bean;
import com.postrofit.backend.Bean.Delivery3Bean;
import com.postrofit.backend.Model.DTO.DeliveryCostDTO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
    @Autowired
    Delivery1Bean delivery1Bean;
    @Autowired
    Delivery2Bean delivery2Bean;
    @Autowired
    Delivery3Bean delivery3Bean;

    public DeliveryCostDTO delivery1(String start, String end) {
        return delivery1Bean.exec(start, end);
    }

    // 배달 주문 받고 보관함 비밀번호 리턴
    public StoragePasswordDTO delivery2(String start, String end, String userId) {
        return delivery2Bean.exec(start, end, userId);
    }

    public StoragePasswordDTO delivery3(String userId) {
        return delivery3Bean.exec(userId);

    }
}
