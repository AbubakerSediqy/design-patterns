package com.company.CoffeeFlavours;

import com.company.Coffee;
import com.company.Flavour;

public class Soy extends Flavour {

    Coffee coffee;

    public Soy(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost() + 1;
    }
    
}
