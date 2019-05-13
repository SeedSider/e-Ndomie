package com.adprog6.endomie;
import com.adprog6.endomie.history.History;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.adprog6.endomie.historyservice.HistoryService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EndomieHistoryTest {

    @Autowired
    private HistoryService historyService;

    private History history;
    private History history2;
    private History history3;
    private History history4;

    @Before
    public void setUp() {
        history = new History();
        history.setUsername("hist1");
        historyService.saveHistory(history);

        history2 = new History();
        history2.setUsername("hist2");
        historyService.saveHistory(history2);

        history3 = new History();
        history3.setUsername("hist3");
        historyService.saveHistory(history3);


    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void addingHistory() {

        History[] arrayOfHistories = {history, history2, history3};
        Iterable<History> allHistory = historyService.listAllHistory();

        int idx = 0;
        for (History e: allHistory) {
            Assert.assertEquals(arrayOfHistories[idx].getUsername(), e.getUsername());
            idx++;
            if(idx == 4) break;
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
        Assert.assertEquals("check if get method is correct", history.getUsername(), historyService
                .getHistoryById(histIndex).getUsername());

        histIndex = 2;
        Assert.assertEquals("check if get method is correct", history2.getUsername(), historyService
                .getHistoryById(histIndex).getUsername());

        histIndex = 3;
        Assert.assertEquals("check if get method is correct", history3.getUsername(), historyService
                .getHistoryById(histIndex).getUsername());
    }

    @Test
    public void updateHistory() {

        history4 = new History();
        history4.setUsername("hist4");
        historyService.saveHistory(history4);

        int histIndex = 4;
        History histUpdate = historyService.getHistoryById(histIndex);

        histUpdate.setUsername("other");
        historyService.saveHistory(histUpdate);

        System.out.println(histUpdate.getUsername());

        Assert.assertEquals(
                "update cart3 and validate update",
                histUpdate.getUsername(),
                historyService.getHistoryById(histIndex).getUsername()
        );
    }

}

