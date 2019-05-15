package com.adprog6.endomie.order;

public class Delivery implements OrderBehaviour {
    private String deliveryAddress;
    private double deliveryFeePercentage=0.3;

    @Override
    public void orderType() { System.out.println("Delivery");}

    public void setDeliveryAddress(String address){
        this.deliveryAddress = address;
    }

    public double getDeliveryFeePercentage(){return deliveryFeePercentage;};
}
