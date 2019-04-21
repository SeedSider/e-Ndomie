package com.adprog6.endomie.diy.noodles;

import com.adprog6.endomie.diy.CustomNoodle;

public class Soto extends CustomNoodle {
	public Soto() {
		description = "Indomie Rasa Soto";
	}

	@Override
	public int cost() {
		return 7000;
	}
}
