package com.adprog6.endomie.diy;

import com.adprog6.endomie.diy.noodles.IndomieProducer;
import com.adprog6.endomie.diy.toppings.ToppingDecorator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultipleToppingTest {
	private CustomNoodle IndomieRendangTelurKornet;
	private CustomNoodle IndomieSotoSosisBawangGoreng;
	private CustomNoodle IndomieGorengTelurBawangGoreng;
	private CustomNoodle IndomieSotoBawangGoreng;

	@Test
	public void testIndomieRendangTelurKornetCost() {
		IndomieRendangTelurKornet = IndomieProducer.INDOMIE_RENDANG.BaseNoodleCreator();
		assertEquals(7500, IndomieRendangTelurKornet.cost());

		IndomieRendangTelurKornet = ToppingDecorator.TELUR.addTopping(IndomieRendangTelurKornet);
		assertEquals(9500, IndomieRendangTelurKornet.cost());

		IndomieRendangTelurKornet = ToppingDecorator.KORNET.addTopping(IndomieRendangTelurKornet);
		assertEquals(11000, IndomieRendangTelurKornet.cost());

		assertEquals("Indomie Goreng Rasa Rendang + Telur + Kornet",
				IndomieRendangTelurKornet.getDescription());
	}

	@Test
	public void testIndomieSotoSosisBawangGorengCost() {
		IndomieSotoSosisBawangGoreng = IndomieProducer.INDOMIE_SOTO.BaseNoodleCreator();
		assertEquals(7000, IndomieSotoSosisBawangGoreng.cost());

		IndomieSotoSosisBawangGoreng = ToppingDecorator.SOSIS.addTopping(IndomieSotoSosisBawangGoreng);
		assertEquals(8000, IndomieSotoSosisBawangGoreng.cost());

		IndomieSotoSosisBawangGoreng = ToppingDecorator.BAWANG_GORENG.addTopping(IndomieSotoSosisBawangGoreng);
		assertEquals(8500, IndomieSotoSosisBawangGoreng.cost());
	}

	@Test
	public void testIndomieGorengTelurBawangGorengCost() {
		IndomieGorengTelurBawangGoreng = IndomieProducer.INDOMIE_GORENG.BaseNoodleCreator();
		assertEquals(7000, IndomieGorengTelurBawangGoreng.cost());

		IndomieGorengTelurBawangGoreng = ToppingDecorator.TELUR.addTopping(IndomieGorengTelurBawangGoreng);
		assertEquals(9000, IndomieGorengTelurBawangGoreng.cost());

		IndomieGorengTelurBawangGoreng = ToppingDecorator.BAWANG_GORENG.addTopping(IndomieGorengTelurBawangGoreng);
		assertEquals(9500, IndomieGorengTelurBawangGoreng.cost());
	}

}
