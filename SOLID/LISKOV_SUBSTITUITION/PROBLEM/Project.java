package SOLID.LISKOV_SUBSTITUITION.PROBLEM;

import java.util.List;

public class Project {
    private List<Document> documents;

    public void openAll() {
        for (Document d: documents) {
            d.open();
        }
    }

    public void saveAll() {
        for (Document d: documents) {
            /*
                Se não checarmos o tipo de documento e tentar salva-lo irá gerar uma excessão, ou seja, pode quebrar o código
            */
            /*
                O código também viola o princípio aberto/fechado, já que o
                código cliente se torna dependente das classes concretas de documentos. 
            */
            if (!(d instanceof ReadOnlyDocument)) {
                d.save();
            }
        }
    }
}
