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

        // TODO 역마다의 보관 요금
        List<StoreProfitDTO> storeProfitDTOS = getStoreProfitBean.exec(start, size);

        return storeProfitDTOS;
    }
}
