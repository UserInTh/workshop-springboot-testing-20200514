package com.example.pihd.master;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.BDDMockito.given;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PartRegistrationControllerIntegrationTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void getShopByUsername() {
//       ShopListResponse result
//               = restTemplate.getForObject("/api/v1/shop/xxx"
//               , ShopListResponse.class);
//       assertNotNull(result);
//       assertEquals( 2, result.getShop().size(), "");
    }

}