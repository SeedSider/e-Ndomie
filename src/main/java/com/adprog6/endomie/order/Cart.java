package com.adprog6.endomie.order;

public class Cart{

    private OrderBehaviour orderBehaviour;

    public void orderType() {
         orderBehaviour.orderType();
    }

    public void setOrderBehaviour(OrderBehaviour orderBehaviour) {
        this.orderBehaviour = orderBehaviour;
    }

    //public void checkout(){}

}
