package com.adprog6.endomie.diy.toppings;

import com.adprog6.endomie.diy.CustomNoodle;

public enum  ToppingDecorator {
	BAWANG_GORENG;

	public CustomNoodle addTopping(CustomNoodle Noodle) {
		switch (this) {
			case BAWANG_GORENG:
				Noodle = new BawangGoreng(Noodle);
				break;
			default:
				Noodle = new BawangGoreng(Noodle);
				break;
		}
		return Noodle;
	}
}
