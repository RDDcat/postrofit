package com.postrofit.backend.Contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/delivery")
public class DeliveryController {
    @GetMapping("/")
    public String welcome(){
        return "index.html";
    }

    // TODO 배달 1 
    // TODO income (출발역) (도착역)
    // TODO return 예상수익
    @GetMapping("/profit/{start}/{end}")
    public String calcProfit(@PathVariable String start, @PathVariable String end){
        return start + " : " + end + " : calcProfit 실행";
    }

    // TODO 배달 2
    // TODO income (출발역) (도착역) (택배사이즈)
    // TODO return 보관함 정보 출발역 보관함 번호별 보관함 상태
    // TODO return 보관함 정보 도착역 보관함 번호별 보관함 상태
    @GetMapping("/storage/{start}/{end}/{size}")
    public String storage(@PathVariable String start, @PathVariable String end, @PathVariable String size){
        return  start + " : " + end + " : " + size + " : storage 실행";
    }

    // TODO 배달 3
    // TODO income (보관함 번호)
    // TODO return 보관함 비밀번호
    @GetMapping("/password/{storageNumber}")
    public String getStoragePassword(@PathVariable long storageNumber){
        return storageNumber + ": getStoragePassword 실행";
    }


}
