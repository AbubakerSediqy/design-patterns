package com.company.CoffeeFlavours;

import com.company.Coffee;
import com.company.Flavour;

public class Whip extends Flavour {

    Coffee coffee;

    public Whip(Coffee c2) {
        this.coffee = c2;
    }

    @Override
    public double cost() {
        return this.coffee.cost() + 2;
    }
}
