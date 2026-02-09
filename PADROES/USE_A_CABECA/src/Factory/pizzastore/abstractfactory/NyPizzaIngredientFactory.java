package Factory.pizzastore.abstractfactory;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarianaSauce();
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clam createClam() {
        return null;
    }
}
