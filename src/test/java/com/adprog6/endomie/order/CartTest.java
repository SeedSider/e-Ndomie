package com.adprog6.endomie.order;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;

import static org.junit.Assert.*;

public class CartTest {

    private Class<?> cartClass;
    private Cart cart;

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Before
    public void setUp() throws Exception {
        cartClass = Class.forName("com.adprog6.endomie.order.Cart");
        cart = new Cart();
    }

//    @Test
//    public void testOrderanIsAbstract() {
//        int classModifiers = orderClass.getModifiers();
//
//        assertTrue(Modifier.isAbstract(classModifiers));
//    }

    @Test
    public void testOrderanHasOrderBehaviourSetter() throws Exception {
        Method setOrderBehavior = cartClass.getDeclaredMethod("setOrderBehavior",
                OrderBehaviour.class);
        Collection<Parameter> parameters = Arrays.asList(setOrderBehavior.getParameters());
        int methodModifiers = setOrderBehavior.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
    }

    @Test
    public void testCartOrderBehaviour() {
        cart.orderType();
        assertTrue(outputCapture.toString().contains("Dine In"));
        assertTrue(cart.getOrderBehaviour() instanceof DineIn);

        cart.setOrderBehavior(new Delivery());
        cart.orderType();
        assertTrue(outputCapture.toString().contains("Delivery"));
        assertTrue(cart.getOrderBehaviour() instanceof Delivery);
    }
}