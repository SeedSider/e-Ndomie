package com.adprog6.endomie;
import com.adprog6.endomie.history.History;
import com.adprog6.endomie.order.Cart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class EndomieHistoryTest {
    private History history;
    private Cart cart1;
    private Cart cart2;
    private Cart cart3;

    @Before
    public void setUp() {
        history = new History();

        cart1 = new Cart();
        history.addHistory(cart1);

        cart2 = new Cart();
        history.addHistory(cart2);

        cart3 = new Cart();
        history.addHistory(cart3);
    }

    @Test
    public void addingHistory() {

        Cart[] arrayOfCart = {cart1, cart2, cart3};
        Map<Integer, Cart> allCarts = history.getAllHistory();

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
        Cart cart3Update = new Cart();
        history.updateHistory(cart3Index, cart3Update);

        Assert.assertEquals(
                "update cart3 and validate update",
                cart3Update,
                history.getHistory(cart3Index)
        );
    }

}
