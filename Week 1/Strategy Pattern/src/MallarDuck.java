import FlyBehavior.FlyNoWay;
import FlyBehavior.Flyable;
import QuackBehavior.Quack;
import QuackBehavior.Quackable;

public class MallarDuck extends Duck {
    Flyable fly;
    Quackable quack;

    public voide MallarDuck(Flyable fly, Quackable quack) {
        this.fly = fly;
        this.quack = quack;
    }

    public voide performFly(){
        fly.fly();
    }

    public voide performQuack(){
        quack.Quack();
    }

    public void display(){
        System.out.println("I am Mallar Duck");
    }
    
}
