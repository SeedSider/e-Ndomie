public abstract class Cart{

    private OrderBehavior orderBehavior;

    public void order() {
        orderBehavior.order();
    }

    public void setOrderBehavior(OrderBehavior orderBehavior) {
        this.orderBehavior = orderBehavior;
    }

    public void checkout(){}

}
