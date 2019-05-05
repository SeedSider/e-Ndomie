package com.adprog6.endomie.order;

import com.adprog6.endomie.diy.CustomNoodle;

public class Cart{

    private OrderBehaviour orderBehaviour;
    private ArrayList<CustomNoodle listIndomie;

    public Cart(){
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

}
