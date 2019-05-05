package com.adprog6.endomie.order;

public class Delivery implements OrderBehaviour {
    private String deliveryAddress;
    private float deliveryFeePercentage=0.2;

    @Override
    public void orderType() { System.out.println("Delivery");};

    public void setDeliveryAddress(String address){
        this.deliveryAddress = address;
    }

    public float getDeliveryFeePercentage(){return deliveryFeePercentage;}
}
