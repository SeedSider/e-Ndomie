package com.adprog6.endomie.diy.noodles;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class IndomieSotoTest {
	private IndomieSoto indomieSoto;

	@Before
	public void setUp() {
		indomieSoto = new IndomieSoto();
	}

	@Test
	public void testMethodCost() {
		assertEquals(7000, indomieSoto.cost());
	}

	@Test
	public void testMethodGetDescription() {
		assertEquals("Indomie Kuah Rasa Soto", indomieSoto.getDescription());
	}


}
