package com.postrofit.backend.Model.DTO;

import com.postrofit.backend.Model.Enum.StorageSize;
import lombok.Data;

@Data
public class StoreProfitDTO {

    // 보관함 사이즈
    StorageSize size;

    // profit
    int profit;
}
