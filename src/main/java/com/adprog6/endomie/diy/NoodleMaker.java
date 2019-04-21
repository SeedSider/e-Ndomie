package com.adprog6.endomie.diy;

import com.adprog6.endomie.diy.noodles.NoodleProducer;
import com.adprog6.endomie.diy.noodles.Soto;
import com.adprog6.endomie.diy.toppings.ToppingDecorator;

public class NoodleMaker {

	public static void main(String[] args) {
		CustomNoodle SotoOnly = NoodleProducer.SOTO.BaseNoodleCreator();
		CustomNoodle SotoWithOnion = ToppingDecorator.FRIED_ONION.addTopping(new Soto());
		System.out.println(SotoOnly.getDescription() + " " + SotoOnly.cost());
		System.out.println(SotoWithOnion.getDescription() + " " + SotoWithOnion.cost());
	}
}
