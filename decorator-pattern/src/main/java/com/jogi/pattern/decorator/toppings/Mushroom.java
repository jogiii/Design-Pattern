package com.jogi.pattern.decorator.toppings;

import com.jogi.pattern.decorator.BasePizza;

public class Mushroom extends ToppingsDecorator{

    BasePizza basePizza;
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    public int cost() {
        return this.basePizza.cost() +20;
    }
}
