package com.adprog6.endomie.diy.noodles;

import com.adprog6.endomie.diy.CustomNoodle;

public enum IndomieProducer {
	INDOMIE_SOTO,
	INDOMIE_GORENG,
	INDOMIE_RENDANG,
	INDOMIE_AYAM_BAWANG,
	INDOMIE_KARI_AYAM,
	INDOMIE_GORENG_DOUBLE,
	INDOMIE_GORENG_JUMBO,
	INDOMIE_RENDANG_DOUBLE,
	INDOMIE_SOTO_DOUBLE,
	INDOMIE_AYAM_BAWANG_DOUBLE,
	INDOMIE_KARI_AYAM_DOUBLE;

	public CustomNoodle BaseNoodleCreator() {
		CustomNoodle BaseNoodle = null;
		switch (this) {
			case INDOMIE_SOTO:
				BaseNoodle = new IndomieSoto();
				break;
			case INDOMIE_GORENG:
				BaseNoodle = new IndomieGoreng();
				break;
			case INDOMIE_RENDANG:
				BaseNoodle = new IndomieRendang();
				break;
			case INDOMIE_AYAM_BAWANG:
				BaseNoodle = new IndomieAyamBawang();
				break;
			case INDOMIE_KARI_AYAM:
				BaseNoodle = new IndomieKariAyam();
				break;
			case INDOMIE_GORENG_DOUBLE:
				BaseNoodle = new IndomieGorengDouble();
				break;
			case INDOMIE_GORENG_JUMBO:
				BaseNoodle = new IndomieGorengJumbo();
				break;
			case INDOMIE_RENDANG_DOUBLE:
				BaseNoodle = new IndomieRendangDouble();
				break;
			case INDOMIE_SOTO_DOUBLE:
				BaseNoodle = new IndomieSotoDouble();
				break;
			case INDOMIE_AYAM_BAWANG_DOUBLE:
				BaseNoodle = new IndomieAyamBawangDouble();
				break;
			case INDOMIE_KARI_AYAM_DOUBLE:
				BaseNoodle = new IndomieKariAyamDouble();
				break;
			default:
				BaseNoodle = new IndomieDefault();
				break;
		}
		return BaseNoodle;
	}
}
