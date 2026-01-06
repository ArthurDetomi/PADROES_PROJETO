package INTRODUCAO_1.behaviors;

import INTRODUCAO_1.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}

