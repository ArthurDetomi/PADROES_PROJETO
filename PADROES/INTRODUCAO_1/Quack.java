package PADROES.INTRODUCAO_1;

public class Quack implements QuackBeHavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
