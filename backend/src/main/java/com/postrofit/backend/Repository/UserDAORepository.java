package com.postrofit.backend.Repository;

import com.postrofit.backend.Model.DAO.StoreDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAORepository extends JpaRepository<StoreDAO, Long> {
}
