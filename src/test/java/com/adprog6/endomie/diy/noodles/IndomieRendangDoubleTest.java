package com.adprog6.endomie.diy.noodles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndomieRendangDoubleTest {
    private IndomieRendangDouble indomieRendangDouble;

    @Before
    public void setUp() {
        indomieRendangDouble = new IndomieRendangDouble();
    }

    @Test
    public void testMethodCost() {
        assertEquals(13000, indomieRendangDouble.cost());
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Indomie Goreng Rasa Rendang Double", indomieRendangDouble.getDescription());
    }
}
