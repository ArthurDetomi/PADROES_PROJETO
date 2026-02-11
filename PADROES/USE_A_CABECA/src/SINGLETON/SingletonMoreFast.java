package SINGLETON;

public class SingletonMoreFast {
    private static SingletonMoreFast uniqueInstance = new SingletonMoreFast();

    private SingletonMoreFast() {

    }
    // Para não causar erro quando há multiplos segmentos acessando
    public static SingletonMoreFast getInstance() {
        return uniqueInstance;
    }
}
