import FlyBehavior.Flyable;
import QuackBehavior.Quackable;

public abstract class Duck {

    Flyable flyable;
    Quackable quackable;

    public abstract void display();

    public void setFlyBehavior(Flyable fb) {
        flyable = fb;
    }
    
    public void setQuackBehavior(Quackable qb) {
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
