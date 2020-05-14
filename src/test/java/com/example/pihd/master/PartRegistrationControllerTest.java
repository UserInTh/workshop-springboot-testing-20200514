package com.example.pihd.master;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PartRegistrationControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    private ShopRepository shopRepository;

    @Test
    void getShopByUsername() {
        // Stub data
        List<Shop> shopList = new ArrayList<>();
        shopList.add(new Shop("A", "A"));
        shopList.add(new Shop("Q", "Q"));
        given(shopRepository.getShopByUsername("xxx"))
        .willReturn(shopList);

       ShopListResponse result
               = restTemplate.getForObject("/api/v1/shop/xxx"
               , ShopListResponse.class);
       assertNotNull(result);
       assertEquals( 2, result.getShop().size(), "");
    }

}