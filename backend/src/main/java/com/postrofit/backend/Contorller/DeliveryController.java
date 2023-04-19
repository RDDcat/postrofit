package com.postrofit.backend.Contorller;

import com.postrofit.backend.Model.DTO.*;
import com.postrofit.backend.Service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/delivery")
@CrossOrigin("*")
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

    // TODO new
    // 배달할 오더 정보 + 출발역 스토리지 정보
    @GetMapping("/order/storage/{storageId}")
    public ResponseDeliveryOrderStorageDTO getOrderStorageInfo(@PathVariable long storageId){
        return service.getOrderStorageInfo(storageId);
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

    // 옮길게요 시점에서 보관함 정보 줘야함 (옮길 보관함 위치만 표시되어있는 리스트)
    @GetMapping("/storage/{start}/{end}")
    public List<StorageStatDTO> getStorageList(@PathVariable String start, @PathVariable String end){
        return service.getStorageList(start, end);
    }

    // TODO 배달 출발역 비밀번호 확인 (김태영은 보시오!)
    // TODO income (출발역) (도착역) (사용자 아이디)
    // TODO return 보관함 비밀번호
    @GetMapping("/take/password/{start}/{storageNum}")
    public StoragePasswordDTO getStartStoragePassword(@ModelAttribute RequestStartStoragePasswordDTO requestStartStoragePasswordDTO){
        return service.getStartStoragePassword(requestStartStoragePasswordDTO);
    }

    // 옮길게요 배달가능한 갯수 구하기
    @GetMapping("/count/orders/{start}/{end}")
    public DeliveryCountDTO getDeliveryCountDTO(@ModelAttribute RequestStartEndDTO requestStartEndDTO){
        return service.getDeliveryCountDTO(requestStartEndDTO);
    }
}
