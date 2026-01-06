package INTRODUCAO_1;

import INTRODUCAO_1.behaviors.FlyRocketPowered;
import INTRODUCAO_1.ducks.Duck;
import INTRODUCAO_1.ducks.MallardDuck;
import INTRODUCAO_1.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());

        model.performFly();
    }
}
