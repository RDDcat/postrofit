package com.postrofit.backend.Contorller;

import com.postrofit.backend.Model.DTO.DeliveryCostDTO;
import com.postrofit.backend.Model.DTO.RequestTakeOrderDTO;
import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import com.postrofit.backend.Service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    @Autowired
    DeliveryService service;

    // TODO Get방식
    // TODO 배달 비용 조회
    // TODO income (출발역) (도착역)
    // TODO return 택배 사이즈 별 예상수익
    @GetMapping("/cost/{start}/{end}")
    public DeliveryCostDTO getDeliveryCost(@PathVariable String start, @PathVariable String end){
        return service.getDeliveryCost(start, end);
    }

    // TODO 배달 등록
    // TODO income (출발역) (도착역) (사용자 아이디)
    // TODO return 보관함 비밀번호
    @PostMapping("/take")
    public StoragePasswordDTO takeOrder(@RequestBody RequestTakeOrderDTO requestTakeOrderDTO){
        return service.takeOrder(requestTakeOrderDTO);
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
