package SOLID.DEPENDENCY_INVERSION.PROBLEM;

// Classe de alto nível
public class BudgetReport {
    /*
        Problema Dependency Inversion Principle
        Problema a classe de alto nível está dependendo da classe concreta MySQLDatabase de baixo nível
    */
    private MySQLDatabase database;

    public void open() {

    }

    public void save() {

    }
}
