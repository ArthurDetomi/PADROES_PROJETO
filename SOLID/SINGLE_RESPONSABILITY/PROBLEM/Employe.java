public class Employe {
    private String name;

    public String getName() {
        return this.name;
    }

    /*
        Problema, método relacionado a relatório dentro da classe
        Empregado, o que fere o príncipio SOLID de 
        Responsabilidade única
    */
    public void printTimeShiftReport() {
        // Suppose that do anything
    }
}