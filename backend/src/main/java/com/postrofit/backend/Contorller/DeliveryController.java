package com.postrofit.backend.Contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/delivery")
public class DeliveryController {

    // TODO 배달 1 
    // TODO income (출발역) (도착역)
    // TODO return 택배 사이즈 별 예상수익
    @GetMapping("/profit/{start}/{end}")
    public String deliveryCost(@PathVariable String start, @PathVariable String end){
        return start + " : " + end + " : calcProfit 실행";
    }

    // TODO 배달 2
    // TODO 배달 접수
    

    // TODO 배달 3
    // TODO income (보관함 번호)
    // TODO return 보관함 비밀번호
    @GetMapping("/password/{storageNumber}")
    public String getStoragePassword(@PathVariable long storageNumber){
        return storageNumber + ": getStoragePassword 실행";
    }


}
