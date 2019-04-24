package com.adprog6.endomie.diy.toppings;

import com.adprog6.endomie.diy.CustomNoodle;

public class Sosis extends CustomNoodle {
	CustomNoodle customNoodle;

	public Sosis(CustomNoodle customNoodle) {
		this.customNoodle = customNoodle;
	}

	@Override
	public String getDescription() {
		return customNoodle.getDescription() + " + Sosis";
	}

	@Override
	public int cost() {
		return 1000 + customNoodle.cost();
	}
}
