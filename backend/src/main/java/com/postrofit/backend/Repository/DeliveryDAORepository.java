package com.postrofit.backend.Repository;

import com.postrofit.backend.Model.DAO.DeliveryDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryDAORepository extends JpaRepository<DeliveryDAO, Long> {
    DeliveryDAO findDeliveryDAOByUserId(long userId);
}
