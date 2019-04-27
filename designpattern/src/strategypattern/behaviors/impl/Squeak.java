package strategypattern.behaviors.impl;

import strategypattern.behaviors.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak Quack!");
    }
}
