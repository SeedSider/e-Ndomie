package com.adprog6.endomie.diy.toppings;

import com.adprog6.endomie.diy.CustomNoodle;
import com.adprog6.endomie.diy.noodles.IndomieSoto;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BawangGorengTest {
	private Topping indomieSotoBawangGoreng;

	@Before
	public void setUp() {
		indomieSotoBawangGoreng= new BawangGoreng(new IndomieSoto());
	}

	@Test
	public void testMethodCost() {
		assertEquals(7500, indomieSotoBawangGoreng.cost());
	}

	@Test
	public void testMethodDescription() {
		assertEquals("Indomie Kuah Rasa Soto + Bawang Goreng", indomieSotoBawangGoreng.getDescription());
	}
}
