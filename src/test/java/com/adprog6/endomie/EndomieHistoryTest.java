package com.adprog6.endomie;
import com.adprog6.endomie.models.History;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class EndomieHistoryTest {
    private History history;
    private String cart1;
    private String cart2;
    private String cart3;

    @Before
    public void setUp() {
        history = new History();

        cart1 = "cart1";
        history.addHistory(cart1);

        cart2 = "cart2";
        history.addHistory(cart2);

        cart3 = "cart3";
        history.addHistory(cart3);
    }

    @Test
    public void addingHistory() {

        String[] arrayOfCart = {cart1, cart2, cart3};
        Map<Integer, String> allCarts = history.getAllHistory();

        for (int index = 0; index < allCarts.size(); index++) {
            Assert.assertEquals(
                    "match every elements inserted with their inputs ",
                    arrayOfCart[index],
                    allCarts.get(index));
        }


    }

    @Test
    public void getHistory() {
        int cartIndex = 0;
        Assert.assertEquals("check if get method is correct", cart1, history.getHistory(cartIndex));

        cartIndex = 1;
        Assert.assertEquals("check if get method is correct", cart2, history.getHistory(cartIndex));

        cartIndex = 2;
        Assert.assertEquals("check if get method is correct", cart3, history.getHistory(cartIndex));

    }

    @Test
    public void updateHistory() {
        int cart3Index = 2;
        String cart3Update = "cart3.1";
        history.updateHistory(cart3Index, cart3Update);

        Assert.assertEquals(
                "update cart3 and validate update",
                cart3Update,
                history.getHistory(cart3Index)
        );
    }

}
