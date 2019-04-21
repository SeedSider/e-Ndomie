package com.adprog6.endomie.order;

public class OrderSimulator {

    public static void main(String[] args) {
        Cart keranjangbelanja = new Cart();
        keranjangbelanja.setOrderType();
        keranjangbelanja.printOrderBehaviour
        keranjangbelanja.setOrderBehavior(new Delivery());
        keranjangbelanja.setOrderBehaviour(new DineIn());

    }
}