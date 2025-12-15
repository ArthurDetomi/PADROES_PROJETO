package SOLID.LISKOV_SUBSTITUITION.SOLUTION;

import java.util.Date;

// Classe base
public class Document {
    private Date data;
    private String fileName;

    public void open(){
        System.out.println("Abrindo documento");
    }

}
