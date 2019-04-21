package com.adprog6.endomie.models;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class History {
    private static Map<Integer, String> history;
    private int index;

    public History() {
        history = new HashMap<>();
        index = 0;
    }

    public void addHistory(String newCart) {
        history.put(index, newCart);
        index++;
    }

    public Map<Integer, String> getAllHistory() {
        return history;
    }

    public String getHistory(int index) {
        return history.get(index);
    }

    public void updateHistory(int index, String newHistory) {
        history.replace(index, newHistory);
    }
}
