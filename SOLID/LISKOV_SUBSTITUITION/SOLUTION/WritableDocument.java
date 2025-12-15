package SOLID.LISKOV_SUBSTITUITION.SOLUTION;


/*
    Subclasse que extende a classe base
*/
public class WritableDocument extends Document{
    public void save(){
        System.out.println("Salvando documento");
    }
}
