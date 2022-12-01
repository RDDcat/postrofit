package com.postrofit.backend.Bean;

import org.springframework.stereotype.Component;

@Component
public class Order2Bean {
    public int exec(String start, String end, String size){
        // 출발역 도착역 사이즈 받아다가 배달비용 계산
        // TODO 배달비용 계산
        System.out.println("배달비용 계산 : " + start + end + size);

        return 3000;
    }
}
