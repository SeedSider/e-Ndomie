package com.adprog6.endomie.order;

public class DineIn implements OrderBehaviour {
    private String tableNumber;
    private double serviceFeePercentage=0.2;

    @Override
    public void orderType() { System.out.println("Dine In");};

    public void setTableNumber(String tableNumber){
        this.tableNumber=tableNumber;
    }

    public double getServiceFeePercentage() {
        return serviceFeePercentage;
    }
}
