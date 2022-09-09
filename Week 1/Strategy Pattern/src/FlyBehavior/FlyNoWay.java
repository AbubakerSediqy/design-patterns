package FlyBehavior;

public class FlyNoWay implements Flyable {

    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
    
}
