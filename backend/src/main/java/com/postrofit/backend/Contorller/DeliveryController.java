package com.postrofit.backend.Contorller;

import com.postrofit.backend.Model.DTO.DeliveryCostDTO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import com.postrofit.backend.Service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    @Autowired
    DeliveryService service;

    // TODO Get방식
    // TODO 배달 1 
    // TODO income (출발역) (도착역)
    // TODO return 택배 사이즈 별 예상수익
    @GetMapping("/cost/{start}/{end}")
    public DeliveryCostDTO getDeliveryCost(@PathVariable String start, @PathVariable String end){
        return service.delivery1(start, end);
    }

    // TODO Get방식
    // TODO 배달 2
    // TODO income (출발역) (도착역) (사용자 아이디)
    // TODO return 보관함 비밀번호
    @GetMapping("/take/{start}/{end}/{userId}")
    public StoragePasswordDTO takeOrder(@PathVariable String start, @PathVariable String end, @PathVariable String userId){
        return service.delivery2(start, end, userId);
    }
    // TODO Get방식
    // TODO 배달 3
    // TODO income (출발역) (도착역) (사용자 아이디)
    // TODO return 보관함 비밀번호
    @GetMapping("/password/{start}/{end}/{userId}")
    public StoragePasswordDTO getEndPassword(@PathVariable String userId){
        return service.delivery3(userId);
    }

}
