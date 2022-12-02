package com.postrofit.backend.Model.DTO;

import lombok.Data;
import java.util.List;

@Data
public class StorageStationStatDTO {

    List<StorageStatDTO> storageStatDTOList;
    int storageSmall;
    int storageMid;
    int storageBig;

    public StorageStationStatDTO() {
        this.storageSmall = 0;
        this.storageMid = 0;
        this.storageBig = 0;
    }
}
