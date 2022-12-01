package com.postrofit.backend.Model.DTO;

import com.postrofit.backend.Model.Enum.StorageStat;
import lombok.Data;

@Data
public class StorageStatDTO {
    // 보관함 번호(int)
    int storageNumber;

    // 보관함 상태(enum)
    StorageStat storageStat;
}
