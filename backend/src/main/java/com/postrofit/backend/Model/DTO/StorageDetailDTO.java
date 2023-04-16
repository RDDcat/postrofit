package com.postrofit.backend.Model.DTO;

import lombok.Data;

@Data
public class StorageDetailDTO {
    StorageStatDTO storageStatDTO;
    StoragePasswordDTO storagePasswordDTO;

    public void setStorageDetailDTO(StorageStatDTO storageStatDTO, StoragePasswordDTO storagePasswordDTO){
        this.storageStatDTO = storageStatDTO;
        this.storagePasswordDTO = storagePasswordDTO;
    }
}
