package com.postrofit.backend.Repository;

import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderDAORepository extends JpaRepository<OrderDAO, Long> {
    Optional<OrderDAO> findOrderDAOByUserId(long userId);
}
