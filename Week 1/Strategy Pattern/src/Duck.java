import FlyBehavior.Flyable;
import QuackBehavior.Quackable;

public abstract class Duck {

    Flyable flyable;
    Quackable quackable;

    public abstract void display();

    public void Duck(Flyable fly, Quackable quack0){
        flyable = fb;
        quackable = qb;
    }

    public void performFly() {
        flyable.fly();
    }
    public void performQuack() {
        quackable.quack();
    }
    public void swim() {
        System.out.println("All ducks can swim!");
    }
    
}
