package strategypattern.behaviors.impl;

import strategypattern.behaviors.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with a rocket!");
    }
}
