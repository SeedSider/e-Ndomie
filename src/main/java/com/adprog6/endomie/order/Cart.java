package com.adprog6.endomie.order;

public class Cart{

    private OrderBehaviour orderBehaviour;
    /**private ArrayList<Indomie listIndomie =

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

    //public void checkout(){}

}
