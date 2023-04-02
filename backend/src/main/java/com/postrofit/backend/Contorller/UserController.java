package com.postrofit.backend.Contorller;

import com.postrofit.backend.Model.DTO.RequestHistoryDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController("/user")
public class UserController {

    // 유저가 이용중인 보관하기 정보
    @GetMapping("/store/{userId}")
    public String getUserStoreInfo(@PathVariable long userId){
        return "welcome s";
    }

    // 보관하기 - 보관정보 디테일
    @GetMapping("/store/{storageId}")
    public String getUserStoreStorage(@PathVariable long storageId){
        return "welcome s";
    }

    // 히스토리(이용내역) List + 페이징 기능까지
    @GetMapping("/history/{userId}")
    public String getUserHistory(@PathVariable long userId){
        return "welcome s";
    }

    // 히스토리(이용내역) List + 페이징 기능까지
    @PostMapping("/history/detail")
    public String getUserHistoryDetail(@RequestBody RequestHistoryDetailDTO requestHistoryDetailDTO){
        return "welcome s";
    }


}
