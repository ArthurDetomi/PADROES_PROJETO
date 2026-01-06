package STRATEGY.behaviors;

import STRATEGY.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
