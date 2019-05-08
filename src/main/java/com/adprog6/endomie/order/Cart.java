package com.adprog6.endomie.order;

import com.adprog6.endomie.diy.CustomNoodle;

import java.util.ArrayList;

public class Cart{

    private static int id;
    private OrderBehaviour orderBehaviour;
    private ArrayList<CustomNoodle> listIndomie;

    public Cart(){
        this.id=+1;
        setOrderBehavior(new DineIn());
    }

    public void setOrderBehavior(OrderBehaviour orderBehavior) {
        this.orderBehaviour = orderBehavior;
    }

    public void orderType() {
         orderBehaviour.orderType();
    }

    public void setOrderBehaviour(OrderBehaviour orderBehaviour) {
        this.orderBehaviour = orderBehaviour;
    }

    public void addIndomie(CustomNoodle myIndomie){
        listIndomie.add(myIndomie);
    }

    public void deleteIndomie(CustomNoodle myIndomie){
        listIndomie.remove(myIndomie);
    }
}
