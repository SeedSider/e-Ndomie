package com.adprog6.endomie.diy;

import com.adprog6.endomie.diy.noodles.IndomieGoreng;
import com.adprog6.endomie.diy.noodles.IndomieProducer;
import com.adprog6.endomie.diy.noodles.IndomieSoto;
import com.adprog6.endomie.diy.toppings.ToppingDecorator;

public class NoodleMaker {

	public static void main(String[] args) {
		CustomNoodle SotoOnly = IndomieProducer.INDOMIE_SOTO.BaseNoodleCreator();
		CustomNoodle SotoWithOnion = ToppingDecorator.BAWANG_GORENG.addTopping(new IndomieSoto());
		CustomNoodle GorengWithTelur = ToppingDecorator.TELUR.addTopping(new IndomieGoreng());
		CustomNoodle GorengWithTelurBawang = ToppingDecorator.BAWANG_GORENG.addTopping(GorengWithTelur);
		System.out.println(SotoOnly.getDescription() + " " + SotoOnly.cost());
		System.out.println(SotoWithOnion.getDescription() + " " + SotoWithOnion.cost());
		System.out.println(GorengWithTelurBawang.getDescription() + " " + GorengWithTelurBawang.cost());
	}
}
