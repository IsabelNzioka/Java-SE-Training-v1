package com.systechafrica.pos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosTest {

    @Test
    public void testItem() {

        Item item = new Item();

        // Set values for item properties
        item.setItemCode(123);
        item.setQuantity(2);
        item.setUnitPrice(50);

        int expectedTotalValue = item.getQuantity() * item.getUnitPrice();

        // Verify that the getters return the expected values
        Assertions.assertEquals(123, item.getItemCode());
        Assertions.assertEquals(2, item.getQuantity());
        Assertions.assertEquals(50, item.getUnitPrice());
        Assertions.assertEquals(expectedTotalValue, item.getTotalValue()); // TotalValue should be quantity * unitPrice
    }


    @Test
    public void testItemConstructor() {

        Item item = new Item(123, 2, 50);

        // Verify that the getters return the expected values
        Assertions.assertEquals(123, item.getItemCode());
        Assertions.assertEquals(2, item.getQuantity());
        Assertions.assertEquals(50, item.getUnitPrice());
        Assertions.assertEquals(100, item.getTotalValue()); // TotalValue should be quantity * unitPrice
    }
}
