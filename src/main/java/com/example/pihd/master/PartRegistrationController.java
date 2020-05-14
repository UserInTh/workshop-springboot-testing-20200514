package com.example.pihd.master;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PartRegistrationController {


    private ShopRepository shopRepository;

    @Autowired
    public PartRegistrationController(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    @GetMapping("/api/v1/shop/{username}")
    public ShopListResponse getShopByUsername(@PathVariable String username) {
        ShopListResponse result = new ShopListResponse();
        List<Shop> shopList = shopRepository.getShopByUsername(username);
//        shopList.add(new Shop("A", "A"));
//        shopList.add(new Shop("Q", "Q"));
        result.setShop(shopList);
        result.setTrackingPoint(new ArrayList<>(){ { add(new TrackingPoint());}});
        return result;
    }

}
