package com.adprog6.endomie.diy.toppings;

import com.adprog6.endomie.diy.CustomNoodle;

public class Keju extends Topping {

    public Keju(CustomNoodle customNoodle) {
        this.customNoodle = customNoodle;
    }

    @Override
    public String getDescription() {
        return customNoodle.getDescription() + " + Keju";
    }

    @Override
    public int cost() {
        return 2000 + customNoodle.cost();
    }
}
