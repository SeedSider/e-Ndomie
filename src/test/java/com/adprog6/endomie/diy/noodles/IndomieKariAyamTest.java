package com.adprog6.endomie.diy.noodles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndomieKariAyamTest {
    private IndomieKariAyam indomieKariAyam;

    @Before
    public void setUp() {
        indomieKariAyam = new IndomieKariAyam();
    }

    @Test
    public void testMethodCost() {
        assertEquals(7500, indomieKariAyam.cost());
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Indomie Kuah Rasa Kari Ayam", indomieKariAyam.getDescription());
    }
}
