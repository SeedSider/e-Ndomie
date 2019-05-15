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
import org.springframework.web.bind.annotation.*;
import com.adprog6.endomie.diy.model.CartModel;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
public class CartController {
//    @CrossOrigin(origins = "https://e-ndomie.herokuapp.com/")
//    @GetMapping("/cart")
//    public String cart() {
//        return "cart";
//    }

    private static Map<String, CartModel> cartRepo = new HashMap<>();
    @RequestMapping(value = "cart/all", method = RequestMethod.POST)
    public @ResponseBody CartModel checkout(@RequestBody CartModel requestJSON) {
        CartModel cart = new CartModel();
        cart.setId(requestJSON.getId());
        cart.setMenu(requestJSON.getMenu());
        cart.setTotalHarga(requestJSON.getTotalHarga());
        cartRepo.put(cart.getId(), cart);
        return cart;
    }

    @RequestMapping(value = "cart/all")
    public ResponseEntity<Object> getAllCart() {
        return new ResponseEntity<>(cartRepo.values(), HttpStatus.OK);
    }


}

