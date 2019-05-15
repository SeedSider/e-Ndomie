//package com.adprog6.endomie.controllers;
//
//import com.adprog6.endomie.diy.CustomNoodle;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//public class CartController {
//    List<CustomNoodle> isiCart=new ArrayList<>();
//
////    @PostMapping("/saveCart")
////    public ResponseEntity<CustomNoodle> add
//
////    @GetMapping("/cart")
////    public String cart() {
////        return "cart";
////    }
//}
//
//


package com.adprog6.endomie.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }

//    private static Map<String, MenuCreated> menuRepo = new HashMap<>();
//    @RequestMapping(value = "diy/checkout", method = RequestMethod.POST)
//    public @ResponseBody MenuCreated checkout(@RequestBody MenuCreated requestJSON) {
//        MenuCreated menu = new MenuCreated();
//        menu.setId(requestJSON.getId());
//        menu.setMenu(requestJSON.getMenu());
//        menu.setPrice(requestJSON.getPrice());
//        menuRepo.put(menu.getId(), menu);
//        return menu;
//    }
//
//    @RequestMapping(value = "diy/checkout")
//    public ResponseEntity<Object> getMenu() {
//        return new ResponseEntity<>(menuRepo.values(), HttpStatus.OK);
//    }


}

