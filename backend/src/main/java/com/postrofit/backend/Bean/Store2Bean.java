package com.postrofit.backend.Bean;

import com.postrofit.backend.Bean.Small.GetStoreProfitBean;
import com.postrofit.backend.Model.DTO.StoreProfitDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Store2Bean {
    @Autowired
    GetStoreProfitBean getStoreProfitBean;

    public List<StoreProfitDTO> exec(String start, String size){

        // TODO 역 테이블에 브랜드 컬럼 추가 필요

        // TODO 역 이름으로 역 ID 가져오기

        // TODO 역 ID에서 브랜드 이름으로 브랜드 테이블 정보 가져오기

        // TODO 브랜드 테이블에서는 기본 시간, 기본 가격이 적혀있음
        // TODO 기본 시간, 기본 가격 가져오기

        return null;
    }
}
