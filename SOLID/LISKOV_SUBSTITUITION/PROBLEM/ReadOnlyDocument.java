package SOLID.LISKOV_SUBSTITUITION.PROBLEM;

public class ReadOnlyDocument extends Document{
    public void save() {
        throw new RuntimeException("Incapaz de salvar documento somente leitura");
    }
}
