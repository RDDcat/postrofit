package com.postrofit.backend.BeanTest;
import com.postrofit.backend.Bean.Delivery3Bean;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestDelivery3Bean {
    @Autowired
    Delivery3Bean delivery3Bean;
}
