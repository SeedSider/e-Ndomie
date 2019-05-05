package com.adprog6.endomie.diy.toppings;

import com.adprog6.endomie.diy.CustomNoodle;

public class Telur extends Topping {

	public Telur(CustomNoodle customNoodle) {
		this.customNoodle = customNoodle;
	}

	@Override
	public String getDescription() {
		return customNoodle.getDescription() + " + Telur";
	}

	@Override
	public int cost() {
		return 2000 + customNoodle.cost();
	}
}
