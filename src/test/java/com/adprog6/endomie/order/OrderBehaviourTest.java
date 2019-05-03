package com.adprog6.endomie.order;
import org.junit.*;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.Before;
import org.junit.Test;

public class OrderBehaviourTest {

    private Class<?> orderBehaviourClass;

    @Before
    public void setUp() throws Exception {
        orderBehaviourClass = Class.forName("com.adprog6.endomie.order.OrderBehaviour");
    }

    @Test
    public void testOrderBehaviourIsAPublicInterface() {
        int classModifiers = orderBehaviourClass.getModifiers();

        assertTrue(Modifier.isInterface(classModifiers));
        assertTrue(Modifier.isPublic(classModifiers));
    }

    @Test
    public void testOrderBehaviourHasOrderTypeAbstractMethod() throws Exception {
        Method order = orderBehaviourClass.getDeclaredMethod("orderType");
        int methodModifiers = order.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertTrue(Modifier.isAbstract(methodModifiers));
    }
}