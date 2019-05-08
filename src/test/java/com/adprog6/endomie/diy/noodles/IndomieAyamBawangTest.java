package com.adprog6.endomie.diy.noodles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndomieAyamBawangTest {
    private IndomieAyamBawang indomieAyamBawang;

    @Before
    public void setUp() {
        indomieAyamBawang = new IndomieAyamBawang();
    }

    @Test
    public void testMethodCost() {
        assertEquals(7000, indomieAyamBawang.cost());
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Indomie Kuah Rasa Ayam Bawang", indomieAyamBawang.getDescription());
    }
}
