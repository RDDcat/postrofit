package com.postrofit.backend.Contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    // TODO 주문 1
    // TODO income (출발역) (도착역)
    // TODO return 예상수익
    @GetMapping("/storage/{start}")
    public String storageState(@PathVariable String start){
        return start + " : " + " : storageState 실행";
    }

    // TODO 주문 2
    // TODO income (출발역) (도착역) (사이즈)
    // TODO return 배달비용
    @GetMapping("/profit/{start}/{end}/{size}")
    public String orderCost(@PathVariable String start, @PathVariable String end,@PathVariable String size){
        return  start + " : " + end + " : " + size + " : orderPredict 실행";
    }

    // TODO 주문 3
    // TODO income (사용자 아이디)
    // TODO return 보관함 정보 > 보관함 번호, 보관함 비밀번호
    @GetMapping("/profit/{userId}")
    public String orderInfo(@PathVariable String userId){
        return userId + " : calcProfit 실행";
    }


}
