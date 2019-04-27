package strategypattern;

import strategypattern.Duck;
import strategypattern.behaviors.impl.FlyWithWings;
import strategypattern.behaviors.impl.Quack;

import java.rmi.MarshalException;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
