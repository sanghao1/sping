package com.example.springmvcshopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class SpringMvcShopingCartApplicationTests {

    @Test
    void contextLoads() {

        List<Integer> num = List.of(1, 2, 3, 4, 5, 6);

        Optional.ofNullable(num).orElseThrow();
    }

}
