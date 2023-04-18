package com.postrofit.backend.BeanTest.Small;

import com.postrofit.backend.Bean.Small.GetWaitingOrderBean;
import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.StationDAO;
import com.postrofit.backend.Repository.StationDAORepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetWaitingOrderBean {

    @Autowired
    GetWaitingOrderBean getWaitingOrderBean;
    @Autowired
    StationDAORepository stationDAORepository;

    @Test
    @DisplayName("testGetWaitingOrderBean 테스트 : StationDAO start, StationDAO end")
    void testGetWaitingOrderBean(){
        // init 데이터의 OrderDAO order1 참고
        StationDAO start = stationDAORepository.findByStationName("테스트역0");
        StationDAO end = stationDAORepository.findByStationName("테스트역2");

        OrderDAO orderDAO = getWaitingOrderBean.exec(start, end);

        assertEquals(start.getStationId(), orderDAO.getStartStationId());
        assertEquals(end.getStationId(), orderDAO.getEndStationId());
    }
}
