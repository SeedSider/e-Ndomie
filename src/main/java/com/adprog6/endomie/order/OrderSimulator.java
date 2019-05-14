package com.adprog6.endomie.order;

public class OrderSimulator {

    public static void main(String[] args) {
        Cart keranjangbelanja = new Cart();
        keranjangbelanja.orderType();
        keranjangbelanja.setOrderBehavior(new Delivery());
        keranjangbelanja.orderType();
        keranjangbelanja.setOrderBehavior(new DineIn());

    }
}