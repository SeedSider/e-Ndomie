package com.adprog6.endomie.diy;

import com.adprog6.endomie.diy.noodles.IndomieProducer;
import com.adprog6.endomie.diy.toppings.ToppingDecorator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultipleToppingTest {
	private CustomNoodle indomieRendangTelurKornet;
	private CustomNoodle indomieSotoSosisBawangGoreng;
	private CustomNoodle indomieGorengTelurBawangGoreng;
	private CustomNoodle indomieGorengJumboTelurSosis;

	@Test
	public void testIndomieRendangTelurKornetCost() {
		indomieRendangTelurKornet = IndomieProducer.INDOMIE_RENDANG.BaseNoodleCreator();
		assertEquals(7500, indomieRendangTelurKornet.cost());

		indomieRendangTelurKornet = ToppingDecorator.TELUR.addTopping(indomieRendangTelurKornet);
		assertEquals(9500, indomieRendangTelurKornet.cost());

		indomieRendangTelurKornet = ToppingDecorator.KORNET.addTopping(indomieRendangTelurKornet);
		assertEquals(11000, indomieRendangTelurKornet.cost());

		assertEquals("Indomie Goreng Rasa Rendang + Telur + Kornet",
				indomieRendangTelurKornet.getDescription());
	}

	@Test
	public void testIndomieSotoSosisBawangGorengCost() {
		indomieSotoSosisBawangGoreng = IndomieProducer.INDOMIE_SOTO.BaseNoodleCreator();
		assertEquals(7000, indomieSotoSosisBawangGoreng.cost());

		indomieSotoSosisBawangGoreng = ToppingDecorator.SOSIS.addTopping(indomieSotoSosisBawangGoreng);
		assertEquals(8000, indomieSotoSosisBawangGoreng.cost());

		indomieSotoSosisBawangGoreng = ToppingDecorator.BAWANG_GORENG.addTopping(indomieSotoSosisBawangGoreng);
		assertEquals(8500, indomieSotoSosisBawangGoreng.cost());
	}

	@Test
	public void testIndomieGorengTelurBawangGorengCost() {
		indomieGorengTelurBawangGoreng = IndomieProducer.INDOMIE_GORENG.BaseNoodleCreator();
		assertEquals(7000, indomieGorengTelurBawangGoreng.cost());

		indomieGorengTelurBawangGoreng = ToppingDecorator.TELUR.addTopping(indomieGorengTelurBawangGoreng);
		assertEquals(9000, indomieGorengTelurBawangGoreng.cost());

		indomieGorengTelurBawangGoreng = ToppingDecorator.BAWANG_GORENG.addTopping(indomieGorengTelurBawangGoreng);
		assertEquals(9500, indomieGorengTelurBawangGoreng.cost());
	}

	@Test
	public void testIndomieGorengJumboTelurSosisCost() {
		indomieGorengJumboTelurSosis = IndomieProducer.INDOMIE_GORENG.BaseNoodleCreator();
		assertEquals(10000, indomieGorengJumboTelurSosis.cost());

		indomieGorengJumboTelurSosis = ToppingDecorator.TELUR.addTopping(indomieGorengJumboTelurSosis);
		assertEquals(12000, indomieGorengJumboTelurSosis.cost());

		indomieGorengJumboTelurSosis = ToppingDecorator.SOSIS.addTopping(indomieGorengJumboTelurSosis);
		assertEquals(13000, indomieGorengJumboTelurSosis.cost());
	}
}
