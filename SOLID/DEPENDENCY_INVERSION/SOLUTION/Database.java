package SOLID.DEPENDENCY_INVERSION.SOLUTION;

/*
    Ou seja mesmo mudando o banco de dados utilizado na aplicação não afetamos a classe de alto nível
*/
public interface Database {
    public void insert();
    public void update();
    public void delete();
}
