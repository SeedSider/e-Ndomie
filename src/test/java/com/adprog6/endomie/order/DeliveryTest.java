package com.adprog6.endomie.order;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;

public class DeliveryTest {

    private Class<?> deliveryClass;
    private OrderBehaviour delivery;

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Before
    public void setUp() throws Exception {
        deliveryClass = Class.forName("com.adprog6.endomie.order.Delivery");
        delivery = new Delivery();
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

    @Test
    public void testDineInOrderType() {
        delivery.orderType();
        assertTrue(outputCapture.toString().contains("Delivery"));
    }
}