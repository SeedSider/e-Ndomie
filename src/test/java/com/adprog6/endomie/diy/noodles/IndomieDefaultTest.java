package com.adprog6.endomie.diy.noodles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndomieDefaultTest {
	private IndomieDefault indomieDefault;

	@Before
	public void setUp() {
		indomieDefault = new IndomieDefault();
	}

	@Test
	public void testMethodCost() {
		assertEquals(0, indomieDefault.cost());
	}

	@Test
	public void testMethodGetDescription() {
		assertEquals("", indomieDefault.getDescription());
	}
}
