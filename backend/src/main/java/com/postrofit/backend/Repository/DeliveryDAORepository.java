package com.postrofit.backend.Repository;

import com.postrofit.backend.Model.DAO.DeliveryDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeliveryDAORepository extends JpaRepository<DeliveryDAO, Long> {
    DeliveryDAO findDeliveryDAOByUserId(long userId);
    List<DeliveryDAO> findAllByUserId(long userId);

    DeliveryDAO findDeliveryDAOByStorageId(long storageId);

    DeliveryDAO findDeliveryDAOByOrderId(long orderId);
}
