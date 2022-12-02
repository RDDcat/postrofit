package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DTO.StoreProfitDTO;
import com.postrofit.backend.Model.Enum.StorageBrand;
import org.springframework.stereotype.Component;


@Component
public class GetStoreProfitBean {

    public StoreProfitDTO exec(StorageBrand brand, String size) {

        StoreProfitDTO storeProfitDTO = new StoreProfitDTO();

        switch (brand) {
            case SAENU:
                storeProfitDTO.setSize(size);
                storeProfitDTO.setTime(4);
                switch (size){
                    case "SMALL" : storeProfitDTO.setProfit(2000);
                    case "MID" : storeProfitDTO.setProfit(3000);
                    case "BIG" : storeProfitDTO.setProfit(5000);
                }
            case UBI:
                storeProfitDTO.setSize(size);
                storeProfitDTO.setTime(4);
                switch (size){
                    case "SMALL" : storeProfitDTO.setProfit(2000);
                    case "MID" : storeProfitDTO.setProfit(3000);
                    case "BIG" : storeProfitDTO.setProfit(5000);
                }
            case HAPPY:
                storeProfitDTO.setSize(size);
                storeProfitDTO.setTime(4);
                switch (size){
                    case "SMALL" : storeProfitDTO.setProfit(2000);
                    case "MID" : storeProfitDTO.setProfit(3000);
                    case "BIG" : storeProfitDTO.setProfit(5000);
                }
        }
        return storeProfitDTO;
    }
}
