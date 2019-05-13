package com.adprog6.endomie.diy.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ToppingTest {
    private Topping topping;

    @Before
    public void setUp() {
        topping = new Topping();
    }

    @Test
    public void testToppingId() {
        topping.setId("123");
        assertEquals("123", topping.getId());
    }

    @Test
    public void testToppingName() {
        topping.setName("Keju");
        assertEquals("Keju", topping.getName());
    }

    @Test
    public void testToppingDescription() {
        topping.setDescription("lorem ipsun");
        assertEquals("lorem ipsun", topping.getDescription());
    }

    @Test
    public void testToppingCost() {
        topping.setCost(2000);
        assertEquals(2000, topping.getCost());
    }
}
