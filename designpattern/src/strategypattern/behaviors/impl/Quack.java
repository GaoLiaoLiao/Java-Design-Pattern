package strategypattern.behaviors.impl;

import strategypattern.behaviors.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack Quack Quack!");
    }
}
