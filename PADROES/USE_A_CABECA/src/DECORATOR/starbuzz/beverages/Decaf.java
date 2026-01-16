package DECORATOR.starbuzz.beverages;

public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Descafeinado";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
