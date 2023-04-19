package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DTO.StoreProfitDTO;
import com.postrofit.backend.Model.Enum.StorageBrand;
import com.postrofit.backend.Model.Enum.StorageSize;
import org.springframework.stereotype.Component;


@Component
public class GetStoreProfitBean {

    public StoreProfitDTO exec(StorageBrand brand, StorageSize size) {

        StoreProfitDTO storeProfitDTO = new StoreProfitDTO();

        switch (brand) {
            case SAENU:
                storeProfitDTO.setStorageSize(size);
                storeProfitDTO.setTime(4);
                switch (size){
                    case SMALL : storeProfitDTO.setProfit(2000);
                        break;
                    case MID : storeProfitDTO.setProfit(3000);
                        break;
                    case BIG : storeProfitDTO.setProfit(5000);
                        break;
                    default: break;
                }
            case UBI:
                storeProfitDTO.setStorageSize(size);
                storeProfitDTO.setTime(4);
                switch (size){
                    case SMALL : storeProfitDTO.setProfit(2000);
                        break;
                    case MID : storeProfitDTO.setProfit(3000);
                        break;
                    case BIG : storeProfitDTO.setProfit(5000);
                        break;
                    default: break;
                }
            case HAPPY:
                storeProfitDTO.setStorageSize(size);
                storeProfitDTO.setTime(4);
                switch (size){
                    case SMALL : storeProfitDTO.setProfit(2000);
                        break;
                    case MID : storeProfitDTO.setProfit(3000);
                        break;
                    case BIG : storeProfitDTO.setProfit(5000);
                        break;
                    default: break;
                }
        }
        return storeProfitDTO;
    }

    public StoreProfitDTO exec(StationDAO stationDAO, StorageDAO storageDAO) {

        StoreProfitDTO storeProfitDTO = new StoreProfitDTO();
        StorageSize size = storageDAO.getStorageSize();

        switch (stationDAO.getStorageBrand()) {
            case SAENU:
                storeProfitDTO.setStorageSize(size);
                storeProfitDTO.setTime(4);
                switch (size){
                    case SMALL : storeProfitDTO.setProfit(2000);
                        break;
                    case MID : storeProfitDTO.setProfit(3000);
                        break;
                    case BIG : storeProfitDTO.setProfit(5000);
                        break;
                    default: break;
                }
            case UBI:
                storeProfitDTO.setStorageSize(size);
                storeProfitDTO.setTime(4);
                switch (size){
                    case SMALL : storeProfitDTO.setProfit(2000);
                        break;
                    case MID : storeProfitDTO.setProfit(3000);
                        break;
                    case BIG : storeProfitDTO.setProfit(5000);
                        break;
                    default: break;
                }
            case HAPPY:
                storeProfitDTO.setStorageSize(size);
                storeProfitDTO.setTime(4);
                switch (size){
                    case SMALL : storeProfitDTO.setProfit(2000);
                        break;
                    case MID : storeProfitDTO.setProfit(3000);
                        break;
                    case BIG : storeProfitDTO.setProfit(5000);
                        break;
                    default: break;
                }
        }
        return storeProfitDTO;
    }
}
