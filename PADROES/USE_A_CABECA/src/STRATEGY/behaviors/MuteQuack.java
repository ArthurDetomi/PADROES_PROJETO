package STRATEGY.behaviors;

import STRATEGY.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
