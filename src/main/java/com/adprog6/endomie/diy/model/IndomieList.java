package com.adprog6.endomie.diy.model;

import java.util.ArrayList;
import java.util.List;

public class IndomieList {
	private List<Indomie> indomie = new ArrayList<Indomie>();

	public List<Indomie> getIndomie() {
		return indomie;
	}

	public void setIndomie(List<Indomie> indomie) {
		this.indomie = indomie;
	}

	@Override
	public String toString() {
		return "IndomieList=" + indomie + "]";
	}
}
