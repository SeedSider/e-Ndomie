package com.adprog6.endomie.diy.toppings;

import com.adprog6.endomie.diy.noodles.IndomieGorengDouble;
import com.adprog6.endomie.diy.noodles.IndomieGorengJumbo;
import com.adprog6.endomie.diy.noodles.IndomieSoto;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KejuTest {
    private Topping indomieGorengDoubleKeju;

    @Before
    public void setUp() {
        indomieGorengDoubleKeju = new Keju(new IndomieGorengDouble());
    }

    @Test
    public void testMethodCost() {
        assertEquals(14000, indomieGorengDoubleKeju.cost());
    }

    @Test
    public void testMethodDescription() {
        assertEquals("Indomie Goreng Polos Double + Keju", indomieGorengDoubleKeju.getDescription());
    }
}
