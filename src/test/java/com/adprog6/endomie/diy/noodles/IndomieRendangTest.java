package com.adprog6.endomie.diy.noodles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndomieRendangTest {
	private IndomieRendang indomieRendang;

	@Before
	public void setUp() {
		indomieRendang= new IndomieRendang();
	}

	@Test
	public void testMethodCost() {
		assertEquals(7500, indomieRendang.cost());
	}

	@Test
	public void testMethodGetDescription() {
		assertEquals("Indomie Goreng Rasa Rendang", indomieRendang.getDescription());
	}
}
