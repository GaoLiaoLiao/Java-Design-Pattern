package strategypattern;

import strategypattern.behaviors.impl.FlyNoWay;
import strategypattern.behaviors.impl.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
}
