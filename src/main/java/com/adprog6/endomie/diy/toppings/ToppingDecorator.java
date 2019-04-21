package com.adprog6.endomie.diy.toppings;

import com.adprog6.endomie.diy.CustomNoodle;

public enum  ToppingDecorator {
	FRIED_ONION;

	public CustomNoodle addTopping(CustomNoodle Noodle) {
		switch (this) {
			case FRIED_ONION:
				Noodle = new FriedOnion(Noodle);
				break;
			default:
				Noodle = new FriedOnion(Noodle);
				break;
		}
		return Noodle;
	}
}
