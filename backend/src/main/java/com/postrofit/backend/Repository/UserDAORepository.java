package com.postrofit.backend.Repository;

import com.postrofit.backend.Model.DAO.StoreDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAORepository extends JpaRepository<UserDAO, Long> {
}
