package com.postrofit.backend.Model.DTO;

import com.postrofit.backend.Model.Enum.StorageSize;
import lombok.Data;

@Data
public class StoreProfitDTO {

    // 보관함 사이즈
    String size;

    // 기본 요금
    int profit;

    // 기본 시간
    int time;
}
