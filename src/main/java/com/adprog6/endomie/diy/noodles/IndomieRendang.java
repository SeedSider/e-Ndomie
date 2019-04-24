package com.adprog6.endomie.diy.noodles;

import com.adprog6.endomie.diy.CustomNoodle;

public class IndomieRendang extends CustomNoodle {
	public IndomieRendang() {
		description = "Indomie Goreng Rasa Rendang";
	}
	@Override
	public int cost() {
		return 7500;
	}
}
