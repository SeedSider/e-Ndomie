package com.adprog6.endomie.diy.noodles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndomieAyamBawangDoubleTest {
    private IndomieAyamBawangDouble indomieAyamBawangDouble;

    @Before
    public void setUp() {
        indomieAyamBawangDouble = new IndomieAyamBawangDouble();
    }

    @Test
    public void testMethodCost() {
        assertEquals(12000, indomieAyamBawangDouble.cost());
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Indomie Kuah Rasa Ayam Bawang Double", indomieAyamBawangDouble.getDescription());
    }
}
