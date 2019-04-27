package strategypattern.behaviors.impl;

import strategypattern.behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Mute Quack!");
    }
}
