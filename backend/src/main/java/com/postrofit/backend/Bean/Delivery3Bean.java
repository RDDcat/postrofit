package com.postrofit.backend.Bean;

import com.postrofit.backend.Model.DTO.StoragePasswordDTO;
import org.springframework.stereotype.Component;

@Component
public class Delivery3Bean {
    public StoragePasswordDTO exec(String userId){
        // 유저 아이디 가져와서 주문 확인하고 도착역 이름, 사물함 번호, 비밀번호 리턴
        // TODO 유저 아이디 long 으로 형변환

        // TODO 유저 아이디로 배달 확인 확인

        // TODO 배달 아이디에서 주문 아이디 추출

        // TODO 주문 아이디로 주문 DAO 가져오기

        // TODO 주문 DAO에서 도착역 이름을 리턴할 곳에 넣음
        StoragePasswordDTO storagePasswordDTO = new StoragePasswordDTO();
        storagePasswordDTO.setStationName(null);

        // TODO 주문 DAO에서 도착 보관함 아이디 가져오기

        // TODO 도착 보관함 아이디로 도착 보관함 DAO 가져오기

        // TODO 도착 보관함 DAO에서 사물함 번호 가져오기

        // TODO 도착 보관함 아이디로 비밀번호 가져오기

        // TODO 비밀번호 리턴 클래스에 담기


        return storagePasswordDTO;
    }
}
