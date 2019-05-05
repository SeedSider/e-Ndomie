package com.adprog6.endomie.diy.toppings;

import com.adprog6.endomie.diy.CustomNoodle;

public class Kornet extends Topping {

	public Kornet(CustomNoodle customNoodle) {
		this.customNoodle = customNoodle;
	}

	@Override
	public String getDescription() {
		return customNoodle.getDescription() + " + Kornet";
	}

	@Override
	public int cost() {
		return 1500 + customNoodle.cost();
	}
}
