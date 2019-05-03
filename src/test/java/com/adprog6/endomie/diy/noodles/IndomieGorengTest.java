package com.adprog6.endomie.diy.noodles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndomieGorengTest {
	private IndomieGoreng indomieGoreng;

	@Before
	public void setUp() {
		indomieGoreng = new IndomieGoreng();
	}

	@Test
	public void testMethodCost() {
		assertEquals(7000, indomieGoreng.cost());
	}

	@Test
	public void testMethodGetDescription() {
		assertEquals("Indomie Goreng Polos", indomieGoreng.getDescription());
	}
}
