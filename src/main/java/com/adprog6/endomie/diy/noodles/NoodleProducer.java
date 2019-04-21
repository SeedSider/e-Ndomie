package com.adprog6.endomie.diy.noodles;

import com.adprog6.endomie.diy.CustomNoodle;

public enum  NoodleProducer {
	SOTO;

	public CustomNoodle BaseNoodleCreator() {
		CustomNoodle BaseNoodle = null;
		switch (this) {
			case SOTO:
				BaseNoodle = new Soto();
				break;
			default:
				BaseNoodle = new Soto();
				break;
		}
		return BaseNoodle;
	}
}
