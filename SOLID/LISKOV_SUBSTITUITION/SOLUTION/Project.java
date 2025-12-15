package SOLID.LISKOV_SUBSTITUITION.SOLUTION;

import java.util.List;

public class Project {
    private List<Document> allDocs;

    /*
        Agora o problema foi resolvido somente WritableDocuments possuem o método save
        e caso adicione algum outro tipo de documento que também possa basta extende-lo
    */
    private List<WritableDocument> writableDocuments;

    public void openAll() {
        for (Document d: allDocs) {
            d.open();
        }
    }

    public void saveAll() {
       for (WritableDocument doc : writableDocuments) {
            doc.save();
       }
    }
}
