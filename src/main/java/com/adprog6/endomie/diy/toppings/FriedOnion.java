package com.adprog6.endomie.diy.toppings;

import com.adprog6.endomie.diy.CustomNoodle;

public class FriedOnion extends CustomNoodle {
	CustomNoodle customNoodle;

	public FriedOnion(CustomNoodle customNoodle) {
		this.customNoodle = customNoodle;
	}

	@Override
	public String getDescription() {
		return customNoodle.getDescription() + " + Fried Onion";
	}

	@Override
	public int cost() {
		return 500 + customNoodle.cost();
	}
}
