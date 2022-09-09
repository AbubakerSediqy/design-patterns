import FlyBehavior.FlyNoWay;
import FlyBehavior.Flyable;
import QuackBehavior.Quack;
import QuackBehavior.Quackable;

public class MallarDuck extends Duck {
    Flyable fly;
    Quackable quack;

    public MallarDuck() {
        quack = new Quack();
        fly = new FlyNoWay();
    }

    public void display(){
        System.out.println("I am Mallar Duck");
    }
    
}
