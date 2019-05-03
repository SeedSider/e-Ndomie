package com.adprog6.endomie.diy.noodles;

import com.adprog6.endomie.diy.CustomNoodle;

public class IndomieGoreng extends CustomNoodle {
	public IndomieGoreng() {
		description = "Indomie Goreng Polos";
	}

	@Override
	public int cost() {
		return 7000;
	}
}
