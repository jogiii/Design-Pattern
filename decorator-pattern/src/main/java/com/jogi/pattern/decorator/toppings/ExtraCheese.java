package com.jogi.pattern.decorator.toppings;

import com.jogi.pattern.decorator.BasePizza;

public class ExtraCheese extends ToppingsDecorator{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    public int cost() {
        return 10+this.basePizza.cost();
    }
}
