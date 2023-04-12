package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.Enum.StorageSize;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static com.postrofit.backend.Model.Enum.StorageSize.*;

@Component
@Slf4j
public class GetStorageSizeBean {
    public StorageSize exec(String size) {
        StorageSize storageSize = SMALL;

        switch (size.toLowerCase()) {
            case "big" :
                storageSize = BIG;
                break;
            case "mid" :
                storageSize = MID;
                break;
            case "small" :
                storageSize = SMALL;
                break;
            default:
                log.error("storeDAO null 값 들어옴");
                return null;
        }
        return storageSize;
    }
}
