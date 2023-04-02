package com.postrofit.backend.Repository;

import com.postrofit.backend.Model.DAO.StorageDAO;
import com.postrofit.backend.Model.DAO.StoreDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreDAORepository extends JpaRepository<StoreDAO, Long> {
    StoreDAO findStoreDAOByUserId(long userId);
}
