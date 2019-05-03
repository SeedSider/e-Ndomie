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

public class DeliveryTest {

    private Class<?> deliveryClass;

    @Before
    public void setUp() throws Exception {
        deliveryClass = Class.forName("id.ac.ui.cs.advprog.tutorial1.strategy.Delivery");
    }

    @Test
    public void testDeliveryIsOrderBehavior() {
        Collection<Type> classInterfaces = Arrays.asList(deliveryClass.getInterfaces());

        assertTrue(classInterfaces.stream()
                .anyMatch(type -> type.getTypeName()
                        .equals("com.adprog6.endomie.order.OrderBehaviour"))
        );
    }

    @Test
    public void testDeliveryOverrideOrderTypeMethod() throws Exception {
        Method delivery = deliveryClass.getDeclaredMethod("orderType");
        int methodModifiers = delivery.getModifiers();

        assertTrue(Modifier.isPublic(methodModifiers));
        assertEquals("void", delivery.getGenericReturnType().getTypeName());
    }
}