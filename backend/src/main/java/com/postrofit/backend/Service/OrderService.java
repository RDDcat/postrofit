package com.postrofit.backend.Service;

import com.postrofit.backend.Bean.Order1Bean;
import com.postrofit.backend.Bean.Order2Bean;
import com.postrofit.backend.Model.DTO.StorageStatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    Order1Bean order1Bean;
    @Autowired
    Order2Bean order2Bean;

    public List<StorageStatDTO> order1(String start){
        return order1Bean.exec(start);
    }
    public int order2(String start, String end, String size){
        return order2Bean.exec(start, end, size);
    }
    public void order3(String userId){
        // 사용자 아이디 받아다가 주문 확인해서 보관함 비밀번호 가져오는거
        // TODO 주문확인

        // TODO 보관함 id로 보관함 비번 조회
        
        // TODO 결과리턴


    }
}
