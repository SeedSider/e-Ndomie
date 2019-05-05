package com.adprog6.endomie.diy.model;

public class Topping {

	private String name;
	private String description;
	private int cost;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String toString() {
		return "topping [name=" + name + ", description=" + description + ", cost=" + cost;
	}
}
