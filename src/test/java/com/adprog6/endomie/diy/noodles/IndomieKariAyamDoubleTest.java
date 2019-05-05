package com.adprog6.endomie.diy.noodles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndomieKariAyamDoubleTest {
    private IndomieKariAyamDouble indomieKariAyamDouble;

    @Before
    public void setUp() {
        indomieKariAyamDouble = new IndomieKariAyamDouble();
    }

    @Test
    public void testMethodCost() {
        assertEquals(12000, indomieKariAyamDouble.cost());
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Indomie Kuah Rasa Kari Ayam Double", indomieKariAyamDouble.getDescription());
    }
}
