package com.adprog6.endomie.order;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.Before;
import org.junit.Test;

public class OrderBehaviorTest {

    private Class<?> orderBehaviorClass;

    @Before
    public void setUp() throws Exception {
        orderBehaviorClass = Class.forName("main.OrderBehavior");
    }

    @Test
    public void testOrderBehaviorIsAPublicInterface() {
        int classModifiers = orderBehaviorClass.getModifiers();

        assertTrue(Modifier.isInterface(classModifiers));
        assertTrue(Modifier.isPublic(classModifiers));
    }

    @Test
    public void testOrderBehaviorHasOrderAbstractMethod() throws Exception {
        Method order = orderBehaviorClass.getDeclaredMethod("order");
        int methodModifiers = order.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertTrue(Modifier.isAbstract(methodModifiers));
    }
}