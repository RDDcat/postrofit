package com.postrofit.backend.Repository;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StationDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationDAORepository extends JpaRepository<StationDAO, Long> {

    StationDAO findByStationName(String name);
}
