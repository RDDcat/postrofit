package com.postrofit.backend.BeanTest.Small;

import com.netflix.discovery.converters.Auto;
import com.postrofit.backend.Bean.Small.GetStationIdBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGetStationIdBean {

    @Autowired
    GetStationIdBean getStationIdBean;

    // TODO 역이름을 받아와 StationDAO를 가져와 여기서 stationId를 return
    @Test
    @DisplayName("testGetStationIdBean 테스트 : String stationName")
    void testGetStationIdBean(){
        String stationName = "테스트역1";

        long stationId = getStationIdBean.exec(stationName);

        // "테스트역1"의 id는 0이다. (init데이터)
        assertEquals(0L, stationId);
    }
}
