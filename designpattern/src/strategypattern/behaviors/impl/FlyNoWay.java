package strategypattern.behaviors.impl;

import strategypattern.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("CAN NOT fly!");
    }
}
