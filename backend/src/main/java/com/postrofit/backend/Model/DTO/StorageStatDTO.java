package com.postrofit.backend.Model.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.postrofit.backend.Model.Enum.StorageSize;
import com.postrofit.backend.Model.Enum.StorageStat;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StorageStatDTO {
    long storageId;
    // 보관함 번호(int)
    int storageNumber;
    // 보관함 상태(enum)
    StorageStat storageStat;
    StorageSize storageSize;
}
