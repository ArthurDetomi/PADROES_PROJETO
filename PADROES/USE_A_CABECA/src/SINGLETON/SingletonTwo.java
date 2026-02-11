package SINGLETON;

public class SingletonTwo {
    private static SingletonTwo uniqueInstance;

    private SingletonTwo() {

    }
    // Para não causar erro quando há multiplos segmentos acessando
    public static synchronized SingletonTwo getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonTwo();
        }
        return uniqueInstance;
    }
}