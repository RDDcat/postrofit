package com.postrofit.backend.Contorller;

import com.postrofit.backend.Model.DTO.History.HistoryDTO;
import com.postrofit.backend.Model.DTO.History.StoreDTO;
import com.postrofit.backend.Model.DTO.History.HistoryDetailDTO;
import com.postrofit.backend.Model.DTO.RequestHistoryDetailDTO;
import com.postrofit.backend.Model.DTO.StorageDetailDTO;
import com.postrofit.backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    UserService userService;

    // 유저가 이용중인 보관하기 정보
    @GetMapping("/store/{userId}")
    public StoreDTO getUserStoreInfo(@PathVariable long userId){
        return userService.getUserStoreInfo(userId);
    }

    // 보관하기 - 보관정보 디테일
    @GetMapping("/store/storage/{storageId}")
    public StorageDetailDTO getUserStoreStorageDetail(@PathVariable long storageId){
        return userService.getUserStoreStorageDetail(storageId);
    }

    // 히스토리(이용내역) List + 페이징 기능까지
    @GetMapping("/history/{userId}")
    public List<HistoryDTO> getUserHistory(@PathVariable long userId){
        return userService.getUserHistory(userId);
    }

    // 히스토리(이용내역) - 디테일
    @PostMapping("/history/detail")
    public HistoryDetailDTO getUserHistoryDetail(@RequestBody RequestHistoryDetailDTO requestHistoryDetailDTO){
        return userService.getUserHistoryDetail(requestHistoryDetailDTO);
    }


}
