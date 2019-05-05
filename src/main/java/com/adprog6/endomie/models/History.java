package com.adprog6.endomie.models;
import org.springframework.stereotype.Repository;

import com.adprog6.endomie.order.Cart;
import java.util.HashMap;
import java.util.Map;

@Repository
public class History {
    private static Map<Integer, Cart> history;
    private int index;

    public History() {
        history = new HashMap<>();
        index = 0;
    }

    public void addHistory(Cart newCart) {
        history.put(index, newCart);
        index++;
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
