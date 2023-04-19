package com.postrofit.backend.BeanTest;
import com.postrofit.backend.Bean.Store3Bean;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestStore3Bean {
    @Autowired
    Store3Bean store3Bean;
}
