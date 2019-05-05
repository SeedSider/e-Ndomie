package com.adprog6.endomie.diy.toppings;

import static org.junit.Assert.assertEquals;
import com.adprog6.endomie.diy.noodles.IndomieGoreng;
import org.junit.Before;
import org.junit.Test;

public class TelurTest {
	private Topping indomieGorengTelur;

	@Before
	public void setUp() {
		indomieGorengTelur = new Telur(new IndomieGoreng());
	}

	@Test
	public void testMethodCost() {
		assertEquals(9000, indomieGorengTelur.cost());
	}

	@Test
	public void testMethodDescription() {
		assertEquals("Indomie Goreng Polos + Telur", indomieGorengTelur.getDescription());
	}
}
