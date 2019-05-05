package com.adprog6.endomie.diy.toppings;
import com.adprog6.endomie.diy.CustomNoodle;

public abstract class Topping extends CustomNoodle {
	CustomNoodle customNoodle;

	public abstract String getDescription();
}
