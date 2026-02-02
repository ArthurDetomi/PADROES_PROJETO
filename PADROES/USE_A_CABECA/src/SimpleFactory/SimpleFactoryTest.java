package SimpleFactory;

import SimpleFactory.classes.NyPizzaSimpleFactory;
import SimpleFactory.classes.PizzaStore;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        NyPizzaSimpleFactory nyPizzaSimpleFactory = new NyPizzaSimpleFactory();

        PizzaStore pizzaStore = new PizzaStore(nyPizzaSimpleFactory);

        pizzaStore.orderPizza("peperoni");
    }
}
