package com.adprog6.endomie.controllers;

import com.adprog6.endomie.history.History;
import com.adprog6.endomie.historyservice.HistoryService;
import org.springframework.ui.Model;
import com.adprog6.endomie.order.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HistoryController {


    private HistoryService historyService;

    @Autowired
    private void  setHistoryService(HistoryService historyService) {
        this.historyService = historyService;
    }


    @RequestMapping(value = "/histories", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("history", historyService.listAllHistory());
        System.out.println("returning history");
        return "history";
    }

    @RequestMapping("history/{id}")
    public String showProduct(@PathVariable Integer id,Model model) {
        model.addAttribute("history", historyService.getHistoryById(id));
        return "history";
    }

    @RequestMapping("history/new")
    public String newProduct(Model model) {
        model.addAttribute("history", new History());
        return "history";
    }

    @RequestMapping(value = "history", method = RequestMethod.POST)
    public String saveHistory(History history) {
        historyService.saveHistory(history);
        return "redirect:/history/" + history.getIndex();

    }

    @RequestMapping("history/delete/{id}")
    public String delete(@PathVariable Integer id) {
        historyService.deleteHistory(id);
        return "redirect:/history";
    }
}
