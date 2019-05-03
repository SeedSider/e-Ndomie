package com.adprog6.endomie.order;

public class OrderSimulator {

    public static void main(String[] args) {
        Cart keranjangbelanja = new Cart();
        keranjangbelanja.orderType();
        keranjangbelanja.setOrderBehaviour(new Delivery());
        keranjangbelanja.orderType();
        keranjangbelanja.setOrderBehaviour(new DineIn());

    }
}