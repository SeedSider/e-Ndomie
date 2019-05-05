package com.adprog6.endomie.diy.noodles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndomieGorengDoubleTest {
    private IndomieGorengDouble indomieGorengDouble;

    @Before
    public void setUp() {
        indomieGorengDouble = new IndomieGorengDouble();
    }

    @Test
    public void testMethodCost() {
        assertEquals(12000, indomieGorengDouble.cost());
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Indomie Goreng Polos Double", indomieGorengDouble.getDescription());
    }
}
