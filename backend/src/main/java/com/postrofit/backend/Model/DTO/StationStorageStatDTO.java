package com.postrofit.backend.Model.DTO;

import lombok.Data;
import java.util.List;

@Data
public class StationStorageStatDTO {

    List<StorageStatDTO> storageStatDTOList;
    int storageSmall;
    int storageMid;
    int storageBig;
}
