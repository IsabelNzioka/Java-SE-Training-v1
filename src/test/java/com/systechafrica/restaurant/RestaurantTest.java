package com.systechafrica.restaurant;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestaurantTest {

     @Test
    public void testOrder() {
        Order order = new Order();

    
        order.setChai(200);
        order.setAndazi(100);

        // Verify that the getters return the expected values
        assertEquals(200, order.getChai());
        assertEquals(100, order.getAndazi());
    }
    
}
