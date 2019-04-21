package com.adprog6.endomie.diy.noodles;

import com.adprog6.endomie.diy.CustomNoodle;

public enum IndomieProducer {
	INDOMIE_SOTO,
	INDOMIE_GORENG;

	public CustomNoodle BaseNoodleCreator() {
		CustomNoodle BaseNoodle = null;
		switch (this) {
			case INDOMIE_SOTO:
				BaseNoodle = new IndomieSoto();
				break;
			case INDOMIE_GORENG:
				BaseNoodle = new IndomieGoreng();
				break;
			default:
				BaseNoodle = new IndomieSoto();
				break;
		}
		return BaseNoodle;
	}
}
