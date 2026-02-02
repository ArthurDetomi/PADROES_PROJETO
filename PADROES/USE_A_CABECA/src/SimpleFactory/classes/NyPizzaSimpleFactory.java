package SimpleFactory.classes;

import Factory.pizzastore.classes.Pizza;

public class NyPizzaSimpleFactory extends  SimplePizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        System.out.println("Pizza estilo NY");

        if (type.equals("peperoni")) {
            return new PeperoniPizza();
        }

        return null;
    }
}
