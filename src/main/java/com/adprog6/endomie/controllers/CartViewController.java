package com.adprog6.endomie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartViewController {
//    @CrossOrigin(origins = "https://e-ndomie.herokuapp.com/")
    @GetMapping(value = "/cart")
    public String diy() {
        return "cart";
    }
}
