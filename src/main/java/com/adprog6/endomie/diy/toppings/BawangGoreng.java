package com.adprog6.endomie.diy.toppings;

import com.adprog6.endomie.diy.CustomNoodle;

public class BawangGoreng extends CustomNoodle {
	CustomNoodle customNoodle;

	public BawangGoreng(CustomNoodle customNoodle) {
		this.customNoodle = customNoodle;
	}

	@Override
	public String getDescription() {
		return customNoodle.getDescription() + " + Bawang Goreng";
	}

	@Override
	public int cost() {
		return 500 + customNoodle.cost();
	}
}
