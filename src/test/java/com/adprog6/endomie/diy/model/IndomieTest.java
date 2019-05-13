package com.adprog6.endomie.diy.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IndomieTest {
    private Indomie indomie;

    @Before
    public void setUp() {
        indomie = new Indomie();
    }

    @Test
    public void testIndomieId() {
        indomie.setId("123");
        assertEquals("123", indomie.getId());
    }

    @Test
    public void testIndomieName() {
        indomie.setName("Indomie Goreng");
        assertEquals("Indomie Goreng", indomie.getName());
    }

    @Test
    public void testIndomieDescription() {
        indomie.setDescription("lorem ipsun");
        assertEquals("lorem ipsun", indomie.getDescription());
    }

    @Test
    public void testIndomieCost() {
        indomie.setCost(3000);
        assertEquals(3000, indomie.getCost());
    }
}
