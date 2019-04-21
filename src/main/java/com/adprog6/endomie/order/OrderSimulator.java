package com.adprog6.endomie.order;

public class OrderSimulator {

    public static void main(String[] args) {
        Cart keranjangbelanja = new Cart();
        keranjangbelanja.setOrderType();
        keranjangbelanja.setOrderBehavior(new Delivery());
        system.out.println("jd delivery");
        keranjangbelanja.setOrderBehaviour(new DineIn());
        system.out.println("jd delivery");

    }
}