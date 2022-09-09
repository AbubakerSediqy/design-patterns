package QuackBehavior;

public class Silent implements Quackable {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
    
}
