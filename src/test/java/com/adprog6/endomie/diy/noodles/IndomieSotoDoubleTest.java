package com.adprog6.endomie.diy.noodles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndomieSotoDoubleTest {
    private IndomieSotoDouble indomieSotoDouble;

    @Before
    public void setUp() {
        indomieSotoDouble = new IndomieSotoDouble();
    }

    @Test
    public void testMethodCost() {
        assertEquals(12000, indomieSotoDouble.cost());
    }

    @Test
    public void testMethodGetDescription() {
        assertEquals("Indomie Kuah Rasa Soto Double", indomieSotoDouble.getDescription());
    }
}
