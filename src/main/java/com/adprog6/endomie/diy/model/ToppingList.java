package com.adprog6.endomie.diy.model;

import java.util.ArrayList;
import java.util.List;

public class ToppingList {
	private List<Topping> topping = new ArrayList<Topping>();

	public List<Topping> getTopping() {
		return topping;
	}

	public void setTopping(List<Topping> topping) {
		this.topping = topping;
	}

	@Override
	public String toString() {
		return "ToppingList=" + topping + "]";
	}
}
