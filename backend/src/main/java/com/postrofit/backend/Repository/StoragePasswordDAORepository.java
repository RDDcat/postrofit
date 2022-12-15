package com.postrofit.backend.Repository;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StoragePasswordDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoragePasswordDAORepository extends JpaRepository<StoragePasswordDAO, Long> {
}
