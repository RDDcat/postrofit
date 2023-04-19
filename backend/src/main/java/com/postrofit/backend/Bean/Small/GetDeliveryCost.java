package com.postrofit.backend.Bean.Small;

import com.postrofit.backend.Model.DAO.StorageDAO;
import org.springframework.stereotype.Component;

@Component
public class GetDeliveryCost {
    public int exec(StorageDAO storageDAO) {
        return 1800;
    }
}
