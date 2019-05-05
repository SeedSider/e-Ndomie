package com.adprog6.endomie.diy;

import com.adprog6.endomie.diy.noodles.IndomieProducer;
import com.adprog6.endomie.diy.toppings.ToppingDecorator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultipleToppingTest {
	private CustomNoodle indomieRendangTelurKornet;
	private CustomNoodle indomieSotoSosisBawangGoreng;
	private CustomNoodle indomieGorengTelurBawangGoreng;
	private CustomNoodle indomieKariAyamBawangGorengKeju;
	private CustomNoodle indomieAyamBawangTelur;
	private CustomNoodle indomieGorengJumboTelurKeju;
	private CustomNoodle indomieGorengDoubleTelurKornet;
	private CustomNoodle indomieRendangDoubleTelurBawangGoreng;
	private CustomNoodle indomieSotoDoubleKornetKeju;
	private CustomNoodle indomieKariAyamDoubleKornet;
	private CustomNoodle indomieAyamBawangDouble;

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

		assertEquals("Indomie Kuah Rasa Soto + Sosis + Bawang Goreng",
				indomieSotoSosisBawangGoreng.getDescription());
	}

	@Test
	public void testIndomieGorengTelurBawangGorengCost() {
		indomieGorengTelurBawangGoreng = IndomieProducer.INDOMIE_GORENG.BaseNoodleCreator();
		assertEquals(7000, indomieGorengTelurBawangGoreng.cost());

		indomieGorengTelurBawangGoreng = ToppingDecorator.TELUR.addTopping(indomieGorengTelurBawangGoreng);
		assertEquals(9000, indomieGorengTelurBawangGoreng.cost());

		indomieGorengTelurBawangGoreng = ToppingDecorator.BAWANG_GORENG.addTopping(indomieGorengTelurBawangGoreng);
		assertEquals(9500, indomieGorengTelurBawangGoreng.cost());

		assertEquals("Indomie Goreng Polos + Telur + Bawang Goreng",
				indomieGorengTelurBawangGoreng.getDescription());
	}

	@Test
	public void testIndomieKariAyamBawangGorengKejuCost() {
		indomieKariAyamBawangGorengKeju = IndomieProducer.INDOMIE_KARI_AYAM.BaseNoodleCreator();
		assertEquals(7500, indomieKariAyamBawangGorengKeju.cost());

		indomieKariAyamBawangGorengKeju = ToppingDecorator.BAWANG_GORENG.addTopping(indomieKariAyamBawangGorengKeju);
		assertEquals(8000, indomieKariAyamBawangGorengKeju.cost());

		indomieKariAyamBawangGorengKeju = ToppingDecorator.KEJU.addTopping(indomieKariAyamBawangGorengKeju);
		assertEquals(10000, indomieKariAyamBawangGorengKeju.cost());

		assertEquals("Indomie Kuah Rasa Kari Ayam + Bawang Goreng + Keju",
				indomieKariAyamBawangGorengKeju.getDescription());
	}

	@Test
	public void testIndomieAyamBawangTelurCost() {
		indomieAyamBawangTelur = IndomieProducer.INDOMIE_AYAM_BAWANG.BaseNoodleCreator();
		assertEquals(7000, indomieAyamBawangTelur.cost());

		indomieAyamBawangTelur = ToppingDecorator.TELUR.addTopping(indomieAyamBawangTelur);
		assertEquals(9000, indomieAyamBawangTelur.cost());

		assertEquals("Indomie Kuah Rasa Ayam Bawang + Telur",
				indomieAyamBawangTelur.getDescription());
	}

	@Test
	public void testIndomieGorengJumboTelurKejuCost() {
		indomieGorengJumboTelurKeju = IndomieProducer.INDOMIE_GORENG_JUMBO.BaseNoodleCreator();
		assertEquals(10000, indomieGorengJumboTelurKeju.cost());

		indomieGorengJumboTelurKeju = ToppingDecorator.TELUR.addTopping(indomieGorengJumboTelurKeju);
		assertEquals(12000, indomieGorengJumboTelurKeju.cost());

		indomieGorengJumboTelurKeju = ToppingDecorator.KEJU.addTopping(indomieGorengJumboTelurKeju);
		assertEquals(14000, indomieGorengJumboTelurKeju.cost());

		assertEquals("Indomie Goreng Polos Jumbo + Telur + Keju",
				indomieGorengJumboTelurKeju.getDescription());
	}

	@Test
	public void testIndomieGorengDoubleTelurKornetCost() {
		indomieGorengDoubleTelurKornet = IndomieProducer.INDOMIE_GORENG_DOUBLE.BaseNoodleCreator();
		assertEquals(12000, indomieGorengDoubleTelurKornet.cost());

		indomieGorengDoubleTelurKornet = ToppingDecorator.TELUR.addTopping(indomieGorengDoubleTelurKornet);
		assertEquals(14000, indomieGorengDoubleTelurKornet.cost());

		indomieGorengDoubleTelurKornet = ToppingDecorator.KORNET.addTopping(indomieGorengDoubleTelurKornet);
		assertEquals(15500, indomieGorengDoubleTelurKornet.cost());

		assertEquals("Indomie Goreng Polos Double + Telur + Kornet",
				indomieGorengDoubleTelurKornet.getDescription());
	}

	@Test
	public void testIndomieRendangDoubleTelurBawangGorengCost() {
		indomieRendangDoubleTelurBawangGoreng = IndomieProducer.INDOMIE_RENDANG_DOUBLE.BaseNoodleCreator();
		assertEquals(13000, indomieRendangDoubleTelurBawangGoreng.cost());

		indomieRendangDoubleTelurBawangGoreng = ToppingDecorator.TELUR.addTopping(indomieRendangDoubleTelurBawangGoreng);
		assertEquals(15000, indomieRendangDoubleTelurBawangGoreng.cost());

		indomieRendangDoubleTelurBawangGoreng = ToppingDecorator.BAWANG_GORENG.addTopping(indomieRendangDoubleTelurBawangGoreng);
		assertEquals(15500, indomieRendangDoubleTelurBawangGoreng.cost());

		assertEquals("Indomie Goreng Rasa Rendang Double + Telur + Bawang Goreng",
				indomieRendangDoubleTelurBawangGoreng.getDescription());
	}

	@Test
	public void testIndomieSotoDoubleKornetKejuCost() {
		indomieSotoDoubleKornetKeju= IndomieProducer.INDOMIE_SOTO_DOUBLE.BaseNoodleCreator();
		assertEquals(12000, indomieSotoDoubleKornetKeju.cost());

		indomieSotoDoubleKornetKeju = ToppingDecorator.KORNET.addTopping(indomieSotoDoubleKornetKeju);
		assertEquals(13500, indomieSotoDoubleKornetKeju.cost());

		indomieSotoDoubleKornetKeju = ToppingDecorator.KEJU.addTopping(indomieSotoDoubleKornetKeju);
		assertEquals(15500, indomieSotoDoubleKornetKeju.cost());

		assertEquals("Indomie Kuah Rasa Soto Double + Kornet + Keju",
				indomieSotoDoubleKornetKeju.getDescription());
	}

	@Test
	public void testIndomieKariAyamDoubleKornetCost() {
		indomieKariAyamDoubleKornet= IndomieProducer.INDOMIE_KARI_AYAM_DOUBLE.BaseNoodleCreator();
		assertEquals(12000, indomieKariAyamDoubleKornet.cost());

		indomieKariAyamDoubleKornet = ToppingDecorator.KORNET.addTopping(indomieKariAyamDoubleKornet);
		assertEquals(13500, indomieKariAyamDoubleKornet.cost());

		assertEquals("Indomie Kuah Rasa Kari Ayam Double + Kornet",
				indomieKariAyamDoubleKornet.getDescription());
	}

	@Test
	public void testIndomieAyamBawangDoubleCost() {
		indomieAyamBawangDouble= IndomieProducer.INDOMIE_AYAM_BAWANG_DOUBLE.BaseNoodleCreator();
		assertEquals(12000, indomieAyamBawangDouble.cost());

		assertEquals("Indomie Kuah Rasa Ayam Bawang Double",
				indomieAyamBawangDouble.getDescription());
	}
}
