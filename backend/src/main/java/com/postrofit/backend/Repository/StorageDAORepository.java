package com.postrofit.backend.Repository;

import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Model.DAO.StorageDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StorageDAORepository extends JpaRepository<StorageDAO, Long> {

    List<StorageDAO> findStorageDAOByStationDAO(StationDAO stationDAO);

    StorageDAO findStorageDAOByStationDAOAndStorageNumber(StationDAO stationDAO, int storageNumber);

    StorageDAO findStorageDAOByStorageId(long storageId);
}
