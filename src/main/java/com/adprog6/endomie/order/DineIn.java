package com.adprog6.endomie.order;

public class DineIn implements OrderBehaviour {
    private String tableNumber;
    private float serviceFeePercentage=0.15;

    @Override
    public void orderType() { System.out.println("Dine In");};

    public void setTableNumber(String tableNumber){
        this.tableNumber=tableNumber;
    }

    public float getServiceFeePercentage() {
        return serviceFeePercentage;
    }
}
