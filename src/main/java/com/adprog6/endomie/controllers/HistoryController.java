package com.adprog6.endomie.controllers;

import com.adprog6.endomie.history.History;
import com.adprog6.endomie.order.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HistoryController {

    @Autowired
    History history;

    @GetMapping("/history")
    public List<Cart> getAllNotes() {
        return History.findAll();
    }
}
