package strategypattern;

import strategypattern.behaviors.impl.FlyRocketPowered;

public class Client {

    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        Duck duck2 = new RedheadDuck();
        Duck duck3 = new RubberDuck();

        System.out.println("=====duck1========");
        duck1.performFly();
        duck1.performQuack();
        duck1.setFlyBehavior(new FlyRocketPowered());
        duck1.performFly();

        System.out.println("=====duck2========");
        duck2.performFly();
        duck2.performQuack();

        System.out.println("=====duck3========");
        duck3.performFly();
        duck3.performQuack();
    }
}
