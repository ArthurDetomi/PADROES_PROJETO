package INTRODUCAO_1.behaviors;

import INTRODUCAO_1.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
