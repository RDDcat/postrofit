package com.postrofit.backend.Contorller;

import com.postrofit.backend.Model.DTO.StorageStationStatDTO;
import com.postrofit.backend.Service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/store")
public class StoreController {
    @Autowired
    StoreService storeService;

    // TODO 보관 1
    // TODO income (역이름)
    // TODO return 보관함 정보 > 보관함 번호 > 보관함 상태
    // TODO return 보관함 정보 > 보관함 소형 가능 갯수
    // TODO return 보관함 정보 > 보관함 중형 가능 갯수
    // TODO return 보관함 정보 > 보관함 대형 가능 갯수
    @GetMapping("/storage/{start}")
    public StorageStationStatDTO storageState(@PathVariable String start){return storeService.store1(start);}

    // TODO 보관 2
    // TODO income (역이름) (사이즈)
    // TODO return 보관함 정보 > 사이즈별 가격
    @GetMapping("/profit/{start}/{end}/{size}")
    public String orderCost(@PathVariable String start ,@PathVariable String size){
        return  start + " : " + " : " + size + " : orderCost 실행";
    }

    // TODO 보관 3
    // TODO income (사용자 아이디) (보관함 번호)
    // TODO return 보관함 정보 > 보관함 번호, 보관함 비밀번호
    @GetMapping("/profit/{userId}")
    public String orderInfo(@PathVariable String userId){
        return userId + " : orderInfo 실행";
    }


}
