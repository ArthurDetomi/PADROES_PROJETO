package INTRODUCAO_1.behaviors;

import INTRODUCAO_1.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
