package SimpleFactory.classes;

import Factory.pizzastore.classes.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equals("peperoni")) {
            return new PeperoniPizza();
        }

        return null;
    }
}
