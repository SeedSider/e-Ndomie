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

public class CartTest {

    private Class<?> cartClass;

    @Before
    public void setUp() throws Exception {
        cartClass = Class.forName("com.adprog6.endomie.order.Cart");
    }

    @Test
    public void testCartHasOrderBehaviourSetter() throws Exception {
        Method setOrderBehavior = cartClass.getDeclaredMethod("setOrderBehavior",
                OrderBehaviour.class);
        Collection<Parameter> parameters = Arrays.asList(setOrderBehavior.getParameters());
        int methodModifiers = setOrderBehavior.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
    }
}