package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.EmptyStorageCountDTO;
import com.postrofit.backend.Model.Enum.StorageSize;
import com.postrofit.backend.Model.Enum.StorageStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetEmptyStorageCountDTO {
    public EmptyStorageCountDTO exec(List<StorageDAO> storageDAOS) {
        EmptyStorageCountDTO emptyStorageCountDTO = new EmptyStorageCountDTO();
        int smallCount = 0;
        int midCount = 0;
        int bigCount = 0;

        for(StorageDAO storageDAO: storageDAOS){
            if(storageDAO.getStorageStat() == StorageStat.EMPTY){
                if(storageDAO.getStorageSize() == StorageSize.MID){
                    midCount++;
                }
                else if(storageDAO.getStorageSize() == StorageSize.SMALL){
                    smallCount++;
                }
                else if(storageDAO.getStorageSize() == StorageSize.BIG){
                    bigCount++;
                }
            }
        }
        emptyStorageCountDTO.setSmallCount(smallCount);
        emptyStorageCountDTO.setMidCount(midCount);
        emptyStorageCountDTO.setBigCount(bigCount);

        return emptyStorageCountDTO;
    }
}
