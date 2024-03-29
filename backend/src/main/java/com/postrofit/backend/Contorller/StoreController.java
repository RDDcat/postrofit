package com.postrofit.backend.Contorller;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DTO.*;
import com.postrofit.backend.Service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
@CrossOrigin("*")
public class StoreController {
    @Autowired
    StoreService storeService;

    // TODO Get방식
    // TODO 보관 1
    // TODO income (역이름)
    // TODO return 보관함 정보 > 보관함 번호 > 보관함 상태
    // TODO return 보관함 정보 > 보관함 소형 가능 갯수
    // TODO return 보관함 정보 > 보관함 중형 가능 갯수
    // TODO return 보관함 정보 > 보관함 대형 가능 갯수
    @GetMapping("/storage/{start}")
    public List<StorageStatDTO> storageState(@PathVariable String start){return storeService.store1(start);}

    // TODO Get방식
    // TODO 보관 2
    // TODO income (역이름) (사이즈)
    // TODO return 보관함 정보 > 사이즈별 가격
    @GetMapping("/fee/{start}/{size}")
    public StoreProfitDTO storeFee(@PathVariable String start , @PathVariable String size){return storeService.store2(start, size);}

    // TODO Get방식
    // TODO 보관 3
    // TODO income (사용자 아이디) (보관함 번호)
    // TODO return 보관함 정보 > 보관함 번호, 보관함 비밀번호
    @GetMapping("/password/{userId}")
    public StoragePasswordDTO storePassword(@PathVariable String userId){return storeService.store3(userId);
    }

    // 보관 주문
    @PostMapping("/")
    public ResponseEntity<ResponseStorePostDTO> makeStore(@RequestBody RequestStoreDTO requestStoreDTO){
        ResponseStorePostDTO responseStorePostDTO = storeService.makeStore(requestStoreDTO);

        // 유효성 검사 실패시
        if(responseStorePostDTO == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(responseStorePostDTO);
    }

    // 보관 정보 : 정보 잃어버려서 다시보낼때
    @GetMapping("/id/store")
    public ResponseStoreSampleDTO storePasswordList(@RequestParam long storeId){
        return storeService.getStoreId(storeId);
    }
    // 사용자아이디로 보관주문 목록
    @GetMapping("/id/user")
    public ResponseStoreIdsDTO storePassword(@RequestParam long userId){
        return storeService.getStoreIds(userId);
    }

    // 메인 - 빈 보관함 갯수
    @GetMapping("/empty/{stationName}")
    public EmptyStorageCountDTO getEmptyCount(@PathVariable String stationName){
        return storeService.getEmptyCount(stationName);
    }

}
