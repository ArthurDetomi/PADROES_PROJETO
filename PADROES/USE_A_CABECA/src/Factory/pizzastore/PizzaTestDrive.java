package Factory.pizzastore;

import Factory.pizzastore.classes.ChicagoPizzaStore;
import Factory.pizzastore.classes.NyPizzaStore;
import Factory.pizzastore.classes.Pizza;
import Factory.pizzastore.classes.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());


        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
