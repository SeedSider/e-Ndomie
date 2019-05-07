package com.adprog6.endomie.diy.toppings;

import com.adprog6.endomie.diy.CustomNoodle;

public enum  ToppingDecorator {
	BAWANG_GORENG,
	KORNET,
	SOSIS,
	TELUR,
	KEJU;

	public CustomNoodle addTopping(CustomNoodle Topping) {
		switch (this) {
			case BAWANG_GORENG:
				Topping = new BawangGoreng(Topping);
				break;
			case KORNET:
				Topping = new Kornet(Topping);
				break;
			case SOSIS:
				Topping = new Sosis(Topping);
				break;
			case TELUR:
				Topping = new Telur(Topping);
				break;
			case KEJU:
				Topping = new Keju(Topping);
				break;
		}
		return Topping;
	}
}
