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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }
}

