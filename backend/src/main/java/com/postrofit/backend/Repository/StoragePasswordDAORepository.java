package com.postrofit.backend.Repository;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StoragePasswordDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StoragePasswordDAORepository extends JpaRepository<StoragePasswordDAO, Long> {
    // Optional<StoragePasswordDAO> findByStorageId(long storageId);
}
