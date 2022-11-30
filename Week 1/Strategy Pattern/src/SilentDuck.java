public class SilentDuck extends Duck {

    Flyable fly;
    Quackable quack;

    public void SilentDuck(Flyable fly, Quackable quack){\
        this.fly = fly;
        this.quack = quack;
    }

    public voide performFly(){
        fly.fly();
    }

    public void performQuack(){
        quack.quack();
    }

    public void display(){
        System.out.println("I am Silent Duck");
    }

    public void swim(){
        System.out.println("I can swim");
    }
    
}
