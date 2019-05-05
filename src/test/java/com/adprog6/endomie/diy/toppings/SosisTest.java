package com.adprog6.endomie.diy.toppings;

import com.adprog6.endomie.diy.noodles.IndomieRendang;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SosisTest {
	private Topping indomieRendangSosis;

	@Before
	public void setUp() {
		indomieRendangSosis= new Sosis(new IndomieRendang());
	}

	@Test
	public void testMethodCost() {
		assertEquals(8500, indomieRendangSosis.cost());
	}

	@Test
	public void testMethodDescription() {
		assertEquals("Indomie Goreng Rasa Rendang + Sosis", indomieRendangSosis.getDescription());
	}
}
