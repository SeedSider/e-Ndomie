package com.adprog6.endomie.diy;

public abstract class CustomNoodle {
	protected String description = "Unidentified Food";

	public String getDescription() {
		return description;
	}

	public abstract int cost();
}
