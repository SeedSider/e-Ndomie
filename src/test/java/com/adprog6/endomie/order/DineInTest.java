package com.adprog6.endomie.order;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;

public class DineInTest {

    private Class<?> dineInClass;

    @Before
    public void setUp() throws Exception {
        dineInClass = Class.forName("id.ac.ui.cs.advprog.tutorial1.strategy.DineIn");
    }

    @Test
    public void testDineInIsOrderBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(dineInClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("com.adprog6.endomie.order.OrderBehaviour"))
        );
    }

    @Test
    public void testDineInOverrideOrderTypeMethod() throws Exception {
        Method dinein = dineInClass.getDeclaredMethod("orderType");
        int methodModifiers = dinein.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("void", dinein.getGenericReturnType().getTypeName());
    }
}