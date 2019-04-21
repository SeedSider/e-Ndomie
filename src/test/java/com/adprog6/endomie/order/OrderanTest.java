package com.adprog6.endomie.order;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;

public class OrderTest {

    private Class<?> orderanClass;

    @Before
    public void setUp() throws Exception {
        orderanClass = Class.forName("main.Orderan");
    }

    @Test
    public void testOrderanIsAbstract() {
        int classModifiers = orderClass.getModifiers();

        assertTrue(Modifier.isAbstract(classModifiers));
    }

    @Test
    public void testOrederankHasCheckoutMethod() throws Exception {
        Method swim = duckClass.getDeclaredMethod("swim");
        int methodModifiers = checkout.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("void", checkout.getGenericReturnType().getTypeName());
    }

    @Test
    public void testOrderanHasOrderBehaviorSetter() throws Exception {
        Method setOrderBehavior = orderanClass.getDeclaredMethod("setOrderBehavior",
                OrderBehavior.class);
        Collection<Parameter> parameters = Arrays.asList(setOrderBehavior.getParameters());
        int methodModifiers = setOrderBehavior.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
    }

}