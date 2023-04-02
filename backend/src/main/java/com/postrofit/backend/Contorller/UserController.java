package com.postrofit.backend.Contorller;

import com.postrofit.backend.Model.DTO.HistoryDetailDTO;
import com.postrofit.backend.Model.DTO.RequestHistoryDetailDTO;
import com.postrofit.backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    // 유저가 이용중인 보관하기 정보
    @GetMapping("/store/{userId}")
    public String getUserStoreInfo(@PathVariable long userId){
        return "getUserStoreInfo 유저가 이용중인 보관하기 정보";
    }

    // 보관하기 - 보관정보 디테일
    @GetMapping("/store/storage/{storageId}")
    public String getUserStoreStorage(@PathVariable long storageId){
        return "getUserStoreStorage 보관하기 - 보관정보 디테일";
    }

    // 히스토리(이용내역) List + 페이징 기능까지
    @GetMapping("/history/{userId}")
    public String getUserHistory(@PathVariable long userId){
        return "getUserHistory 히스토리(이용내역) List + 페이징 기능까지";
    }

    // 히스토리(이용내역) - 디테일
    @PostMapping("/history/detail")
    public HistoryDetailDTO getUserHistoryDetail(@RequestBody RequestHistoryDetailDTO requestHistoryDetailDTO){
        return userService.getUserHistoryDetail(requestHistoryDetailDTO);
    }


}
