package com.postrofit.backend.Repository;

import com.postrofit.backend.Model.DAO.DeliveryDAO;
import com.postrofit.backend.Model.DAO.OrderDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAORepository extends JpaRepository<OrderDAO, Long> {
}
