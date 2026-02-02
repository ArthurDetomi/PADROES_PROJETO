package Factory.pizzastore.classes;

public class NyStyleCheesePizza extends Pizza {
    public NyStyleCheesePizza() {
        this.name = "NY Style  Sauce and Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}

