import FlyBehavior.FlyNoWay;
import QuackBehavior.Quack;

public class App {
    public static void main(String[] args) throws Exception {
        Duck md = new MallarDuck();
        md.display();
        md.swim();
        md.setFlyBehavior(new FlyNoWay());
        md.setQuackBehavior(new Quack());
        md.performQuack();
        md.performFly();
    }
}
