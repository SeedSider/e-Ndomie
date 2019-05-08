package com.adprog6.endomie.diy.noodles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndomieGorengJumboTest {
    private IndomieGorengJumbo indomieGorengJumbo;

    @Before
    public void setUp() {
        indomieGorengJumbo = new IndomieGorengJumbo();
    }

    @Test
    public void testMethodCost() {
        assertEquals(10000, indomieGorengJumbo.cost());
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Indomie Goreng Polos Jumbo", indomieGorengJumbo.getDescription());
    }
}
