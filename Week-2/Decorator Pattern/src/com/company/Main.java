package com.company;

import com.company.CoffeeFlavours.Soy;
import com.company.CoffeeFlavours.Whip;
import com.company.CoffeeTypes.DarkCoffee;
import com.company.CoffeeTypes.Espreso;

public class Main {

    public static void main(String[] args) {
        
        Coffee c1 = new Espreso();  //  1
        var c2 = new Whip(c1);      //  2 + 1 = 3
        var c3 = new Soy(c2);       //  1 + 3 = 4
        System.out.println("Espreso Price: " + c3.cost());

        Coffee b1 = new DarkCoffee();   // 3
        var b2 = new Soy(b1);           // 1 + 3 = 4
        var b3 = new Soy(b2);           // 2 + 3 = 5
        System.out.println("Dark Coffee Price: " + b3.cost());

    }
}
