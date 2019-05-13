package com.adprog6.endomie;
import com.adprog6.endomie.history.History;
import com.adprog6.endomie.order.Cart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.adprog6.endomie.controllers.HistoryController;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.Map;
import com.adprog6.endomie.historyservice.HistoryService;

public class EndomieHistoryTest {

    @Autowired
    private HistoryService historyService;

    private History history;
    private History history2;
    private History history3;

    @Before
    public void setUp() {
        history = new History();
        historyService.saveHistory(history);

        history2 = new History();
        historyService.saveHistory(history2);

        history3 = new History();
        historyService.saveHistory(history3);

    }

    @Test
    public void addingHistory() {

        History[] arrayOfHistories = {history, history2, history3};
        Iterable<History> allHistory = historyService.listAllHistory();

        int idx = 0;
        for (History e: allHistory) {
            Assert.assertEquals(arrayOfHistories[idx], e);
            idx++;
        }
//        for (int index = 0; index < arrayOfHistories.length; index++) {
//            Assert.assertEquals(
//                    "match every elements inserted with their inputs ",
//                    arrayOfHistories[index],
//                    allHistory.get(index));
//        }


    }

    @Test
    public void getHistory() {
        int histIndex = 1;
        Assert.assertEquals("check if get method is correct", history, historyService
                .getHistoryById(histIndex));

        histIndex = 2;
        Assert.assertEquals("check if get method is correct", history2, historyService
                .getHistoryById(histIndex));

        histIndex = 3;
        Assert.assertEquals("check if get method is correct", history3, historyService
                .getHistoryById(histIndex));
    }

    @Test
    public void updateHistory() {
        int hist2Index = 2;
        History hist2Update = historyService.getHistoryById(hist2Index);

        hist2Update.setUsername("other");
        historyService.saveHistory(hist2Update);

        Assert.assertEquals(
                "update cart3 and validate update",
                hist2Update,
                historyService.getHistoryById(hist2Index)
        );
    }

}
