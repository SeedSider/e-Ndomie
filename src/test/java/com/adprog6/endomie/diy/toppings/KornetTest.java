package com.adprog6.endomie.diy.toppings;

import com.adprog6.endomie.diy.noodles.IndomieRendang;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KornetTest {
	private Kornet indomieRendangKornet;

	@Before
	public void setUp() {
		indomieRendangKornet= new Kornet(new IndomieRendang());
	}

	@Test
	public void testMethodCost() {
		assertEquals(9000, indomieRendangKornet.cost());
	}

	@Test
	public void testMethodDescription() {
		assertEquals("Indomie Goreng Rasa Rendang + Kornet", indomieRendangKornet.getDescription());
	}
}
