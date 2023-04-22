package com.postrofit.backend.Model.DTO;

import lombok.Data;

import java.util.List;

@Data
public class StorageDetailDTO {
    StorageStatDTO storageStatDTO;
    StoragePasswordDTO storagePasswordDTO;

    List<StorageStatDTO> storageStatDTOS;

    public void setStorageDetailDTO(StorageStatDTO storageStatDTO, StoragePasswordDTO storagePasswordDTO, List<StorageStatDTO> storageStatDTOS){
        this.storageStatDTO = storageStatDTO;
        this.storagePasswordDTO = storagePasswordDTO;
        this.storageStatDTOS = storageStatDTOS;
    }
}
