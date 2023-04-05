package com.postrofit.backend.Contorller;

import com.postrofit.backend.Model.DTO.History.HistoryDTO;
import com.postrofit.backend.Model.DTO.HistoryDetailDTO;
import com.postrofit.backend.Model.DTO.RequestHistoryDetailDTO;
import com.postrofit.backend.Model.DTO.StorageDetailDTO;
import com.postrofit.backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    // 유저가 이용중인 보관하기 정보
    @GetMapping("/store/{userId}")
    public String getUserStoreInfo(@PathVariable long userId){
        userService.getUserStoreInfo();
        return "getUserStoreInfo 유저가 이용중인 보관하기 정보";
    }

    // 보관하기 - 보관정보 디테일
    @GetMapping("/store/storage/{storageId}")
    public StorageDetailDTO getUserStoreStorageDetail(@PathVariable long storageId){
        return userService.getUserStoreStorageDetail();
    }

    // 히스토리(이용내역) List + 페이징 기능까지
    @GetMapping("/history/{userId}")
    public List<HistoryDTO> getUserHistory(@PathVariable long userId){
        return userService.getUserHistory();
    }

    // 히스토리(이용내역) - 디테일
    @PostMapping("/history/detail")
    public HistoryDetailDTO getUserHistoryDetail(@RequestBody RequestHistoryDetailDTO requestHistoryDetailDTO){
        return userService.getUserHistoryDetail(requestHistoryDetailDTO);
    }


}
