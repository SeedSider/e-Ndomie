package com.adprog6.endomie.history;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.adprog6.endomie.order.Cart;
import java.util.HashMap;
import java.util.Map;



@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int index;

    private static Map<Integer, Cart> history;

    public void addHistory(Cart newCart) {
        history.put(index, newCart);
    }

    public Map<Integer, Cart> getAllHistory() {
        return history;
    }

    public Cart getHistory(int index) {
        return history.get(index);
    }

    public void updateHistory(int index, Cart newHistory) {
        history.replace(index, newHistory);
    }
}
