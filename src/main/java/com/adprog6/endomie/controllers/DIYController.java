package com.adprog6.endomie.controllers;

import com.adprog6.endomie.diy.CustomNoodle;
import com.adprog6.endomie.diy.model.Indomie;
import com.adprog6.endomie.diy.model.MenuCreated;
import com.adprog6.endomie.diy.model.Topping;
import com.adprog6.endomie.diy.noodles.IndomieDefault;
import com.adprog6.endomie.diy.noodles.IndomieProducer;
import com.adprog6.endomie.diy.toppings.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
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
		indomieGoreng.setThumbnail("http://www.mandirimco.co.id/web/image/product.product/557/image");
		indomieRepo.put(indomieGoreng.getId(), indomieGoreng);

		Indomie indomieSoto = new Indomie();
		CustomNoodle indomie2 = IndomieProducer.INDOMIE_SOTO.BaseNoodleCreator();
		indomieSoto.setId("2");
		indomieSoto.setName("Indomie Soto");
		indomieSoto.setDescription(indomie2.getDescription());
		indomieSoto.setCost(indomie2.cost());
		indomieSoto.setThumbnail("http://www.mandirimco.co.id/web/image/product.product/560/image");
		indomieRepo.put(indomieSoto.getId(), indomieSoto);

		Indomie indomieRendang = new Indomie();
		CustomNoodle indomie3 = IndomieProducer.INDOMIE_RENDANG.BaseNoodleCreator();
		indomieRendang.setId("3");
		indomieRendang.setName("Indomie Rendang");
		indomieRendang.setDescription(indomie3.getDescription());
		indomieRendang.setCost(indomie3.cost());
		indomieRendang.setThumbnail("https://cs1.alfacart.com/product/1/A09430005096-1.jpg");
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
		topping1.setThumbnail("https://thumbs.dreamstime.com/b/fried-onions-deep-crispy-red-onion-slices-66146513.jpg");
		toppingRepo.put(topping1.getId(), topping1);

		Topping topping2 = new Topping();
		Kornet kornet = new Kornet(new IndomieDefault());
		topping2.setName("Kornet");
		topping2.setDescription(kornet.getDescription());
		topping2.setCost(kornet.cost());
		topping2.setThumbnail("https://thumbs.dreamstime.com/b/cornet-beef-37194444.jpg");
		topping2.setId("2");
		toppingRepo.put(topping2.getId(), topping2);

		Topping topping3 = new Topping();
		Sosis sosis = new Sosis(new IndomieDefault());
		topping3.setName("Sosis");
		topping3.setDescription(sosis.getDescription());
		topping3.setCost(sosis.cost());
		topping3.setId("3");
		topping3.setThumbnail("https://thumbs.dreamstime.com/b/sausage-grilled-fast-food-mustard-54602801.jpg");
		toppingRepo.put(topping3.getId(), topping3);

		Topping topping4 = new Topping();
		Telur telur = new Telur(new IndomieDefault());
		topping4.setName("Telur");
		topping4.setDescription(telur.getDescription());
		topping4.setCost(telur.cost());
		topping4.setId("4");
		topping4.setThumbnail("https://s2.bukalapak.com/img/7845937291/w-300/TELUR_AYAM_NEGRI_CURAH.jpg.webp");
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

	private static Map<String, MenuCreated> menuRepo = new HashMap<>();
	@RequestMapping(value = "diy/checkout", method = RequestMethod.POST)
	public @ResponseBody MenuCreated checkout(@RequestBody MenuCreated requestJSON) {
		MenuCreated menu = new MenuCreated();
		menu.setId(requestJSON.getId());
		menu.setMenu(requestJSON.getMenu());
		menu.setPrice(requestJSON.getPrice());
		menuRepo.put(menu.getId(), menu);
		return menu;
	}

	@RequestMapping(value = "diy/checkout")
	public ResponseEntity<Object> getMenu() {
		return new ResponseEntity<>(menuRepo.values(), HttpStatus.OK);
	}



}
