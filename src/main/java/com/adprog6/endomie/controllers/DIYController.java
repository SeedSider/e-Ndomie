package com.adprog6.endomie.controllers;

import com.adprog6.endomie.diy.CustomNoodle;
import com.adprog6.endomie.diy.model.Indomie;
import com.adprog6.endomie.diy.model.Topping;
import com.adprog6.endomie.diy.noodles.IndomieDefault;
import com.adprog6.endomie.diy.noodles.IndomieProducer;;
import com.adprog6.endomie.diy.toppings.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
@RestController
public class DIYController {
	private static Map<String, Indomie> indomieRepo = new HashMap<>();
	static {
		Indomie indomieGoreng = new Indomie();
		CustomNoodle indomie1 = IndomieProducer.INDOMIE_GORENG.BaseNoodleCreator();
		indomieGoreng.setId("1");
		indomieGoreng.setName("Indomie Goreng");
		indomieGoreng.setDescription(indomie1.getDescription());
		indomieGoreng.setCost(indomie1.cost());
		indomieRepo.put(indomieGoreng.getId(), indomieGoreng);

		Indomie indomieSoto = new Indomie();
		CustomNoodle indomie2 = IndomieProducer.INDOMIE_SOTO.BaseNoodleCreator();
		indomieSoto.setId("2");
		indomieSoto.setName("Indomie Soto");
		indomieSoto.setDescription(indomie2.getDescription());
		indomieSoto.setCost(indomie2.cost());
		indomieRepo.put(indomieSoto.getId(), indomieSoto);

		Indomie indomieRendang = new Indomie();
		CustomNoodle indomie3 = IndomieProducer.INDOMIE_RENDANG.BaseNoodleCreator();
		indomieRendang.setId("3");
		indomieRendang.setName("Indomie Rendang");
		indomieRendang.setDescription(indomie3.getDescription());
		indomieRendang.setCost(indomie3.cost());
		indomieRepo.put(indomieRendang.getId(), indomieRendang);
	}

	private static Map<String, Topping> toppingRepo = new HashMap<>();
	static {
		Topping topping1 = new Topping();
		BawangGoreng bawangGoreng = new BawangGoreng(new IndomieDefault());
		topping1.setId("1");
		topping1.setName("Bawang Goreng");
		topping1.setDescription(bawangGoreng.getDescription());
		topping1.setCost(bawangGoreng.cost());
		toppingRepo.put(topping1.getId(), topping1);

		Topping topping2 = new Topping();
		Kornet kornet = new Kornet(new IndomieDefault());
		topping2.setName("Kornet");
		topping2.setDescription(kornet.getDescription());
		topping2.setCost(kornet.cost());
		topping2.setId("2");
		toppingRepo.put(topping2.getId(), topping2);

		Topping topping3 = new Topping();
		Sosis sosis = new Sosis(new IndomieDefault());
		topping3.setName("Sosis");
		topping3.setDescription(sosis.getDescription());
		topping3.setCost(sosis.cost());
		topping3.setId("3");
		toppingRepo.put(topping3.getId(), topping3);

		Topping topping4 = new Topping();
		Telur telur = new Telur(new IndomieDefault());
		topping4.setName("Telur");
		topping4.setDescription(telur.getDescription());
		topping4.setCost(telur.cost());
		topping4.setId("4");
		toppingRepo.put(topping4.getId(), topping4);
	}
	@RequestMapping(value = "diy/noodles")
		public ResponseEntity<Object> getIndomie() {
			return new ResponseEntity<>(indomieRepo.values(), HttpStatus.OK);
		}

	@RequestMapping(value = "diy/toppings")
		public ResponseEntity<Object> getTopping() {
			return new ResponseEntity<>(toppingRepo.values(), HttpStatus.OK);
		}

	@GetMapping("/diy")
	public String diy() {
		return "diy";
	}
}
