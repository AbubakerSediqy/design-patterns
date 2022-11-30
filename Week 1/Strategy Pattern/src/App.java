import FlyBehavior.FlyNoWay;
import QuackBehavior.Quack;

public class App {
    public static void main(String[] args) throws Exception {
        Duck sd = new SilentDuck(new FlyNoWay(), new Quack());
        sd.performFly();
        sd.performQuack();
        sd.display();
        sd.swim();
    }
}
