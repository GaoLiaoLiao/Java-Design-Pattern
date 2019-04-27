package strategypattern;

import strategypattern.behaviors.impl.FlyWithWings;
import strategypattern.behaviors.impl.MuteQuack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }
}
