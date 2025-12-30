package PADROES.INTRODUCAO_1;

public class MuteQuack implements QuackBeHavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
