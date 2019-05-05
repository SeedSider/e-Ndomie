package com.adprog6.endomie.diy;

import java.io.File;

import com.adprog6.endomie.diy.model.Indomie;
import com.adprog6.endomie.diy.model.IndomieList;
import com.adprog6.endomie.diy.model.Topping;
import com.adprog6.endomie.diy.model.ToppingList;
import com.adprog6.endomie.diy.noodles.IndomieDefault;
import com.adprog6.endomie.diy.noodles.IndomieProducer;
import com.adprog6.endomie.diy.toppings.BawangGoreng;
import com.adprog6.endomie.diy.toppings.Kornet;
import com.adprog6.endomie.diy.toppings.Sosis;
import com.adprog6.endomie.diy.toppings.Telur;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IndomieMapping {
	public static void main(String[] args) {
		IndomieList indomieList = getIndomie();
		ToppingList toppingList = getTopping();

		ObjectMapper mapper = new ObjectMapper();

		try {
			mapper.writeValue(new File("indomie.json"), indomieList);
			mapper.writeValue(new File("topping.json"), toppingList);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static IndomieList getIndomie() {
		Indomie indomieGoreng = new Indomie();
		CustomNoodle indomie1 = IndomieProducer.INDOMIE_GORENG.BaseNoodleCreator();
		indomieGoreng.setName("Indomie Goreng");
		indomieGoreng.setDescription(indomie1.getDescription());
		indomieGoreng.setCost(indomie1.cost());

		Indomie indomieSoto = new Indomie();
		CustomNoodle indomie2 = IndomieProducer.INDOMIE_SOTO.BaseNoodleCreator();
		indomieSoto.setName("Indomie Soto");
		indomieSoto.setDescription(indomie2.getDescription());
		indomieSoto.setCost(indomie2.cost());

		Indomie indomieRendang = new Indomie();
		CustomNoodle indomie3 = IndomieProducer.INDOMIE_RENDANG.BaseNoodleCreator();
		indomieRendang.setName("Indomie Rendang");
		indomieRendang.setDescription(indomie3.getDescription());
		indomieRendang.setCost(indomie3.cost());

		IndomieList indomieList = new IndomieList();
		indomieList.getIndomie().add(indomieGoreng);
		indomieList.getIndomie().add(indomieSoto);
		indomieList.getIndomie().add(indomieRendang);

		return indomieList;
	}

	private static ToppingList getTopping() {
		Topping topping1 = new Topping();
		BawangGoreng bawangGoreng = new BawangGoreng(new IndomieDefault());
		topping1.setName("Bawang Goreng");
		topping1.setDescription(bawangGoreng.getDescription());
		topping1.setCost(bawangGoreng.cost());

		Topping topping2 = new Topping();
		Kornet kornet = new Kornet(new IndomieDefault());
		topping2.setName("Kornet");
		topping2.setDescription(kornet.getDescription());
		topping2.setCost(kornet.cost());

		Topping topping3 = new Topping();
		Sosis sosis = new Sosis(new IndomieDefault());
		topping3.setName("Sosis");
		topping3.setDescription(sosis.getDescription());
		topping3.setCost(sosis.cost());

		Topping topping4 = new Topping();
		Telur telur = new Telur(new IndomieDefault());
		topping4.setName("Telur");
		topping4.setDescription(telur.getDescription());
		topping4.setCost(telur.cost());

		ToppingList toppingList= new ToppingList();
		toppingList.getTopping().add(topping1);
		toppingList.getTopping().add(topping2);
		toppingList.getTopping().add(topping3);
		toppingList.getTopping().add(topping4);

		return toppingList;
	}
}
