package PADROES.INTRODUCAO_1;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBeHavior quackBeHavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBeHavior.quack();
    }

}
