package com.adprog6.endomie.order;

public class Delivery implements OrderBehaviour {
    private String address;
    private float deliveryFeePercentage=0.2;

    @Override
    public void orderType() { System.out.println("Delivery");};

    public void setAddress(String address){
        this.address = address;
    }

    public float getDeliveryFeePercentage(){return deliveryFeePercentage;}
}
