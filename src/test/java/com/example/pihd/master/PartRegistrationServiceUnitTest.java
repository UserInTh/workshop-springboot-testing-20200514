package com.example.pihd.master;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class PartRegistrationServiceUnitTest {

    @Mock
    private ShopRepository shopRepository;

    @Test
    @DisplayName("เรากำลังทดสอบ การดึงข้อมูลของ shop นะ")
    void success_flow() {
        // Stub data
        List<Shop> shopList = new ArrayList<>();
        shopList.add(new Shop("A", "A"));
        shopList.add(new Shop("Q", "Q"));
        given(shopRepository.getShopByUsername("xxx"))
                .willReturn(shopList);

        PartRegistrationController service =
                new PartRegistrationController(shopRepository);
        ShopListResponse result = service.getShopByUsername("xxx");
        assertNotNull(result);
        assertEquals( 2, result.getShop().size(), "");
    }
}