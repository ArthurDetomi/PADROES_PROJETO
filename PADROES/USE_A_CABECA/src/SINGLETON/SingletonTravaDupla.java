package SINGLETON;

public class SingletonTravaDupla {
    private volatile static SingletonTravaDupla uniqueInstance;

    private SingletonTravaDupla() {
    }

    public static SingletonTravaDupla getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonTravaDupla.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonTravaDupla();
                }
            }
        }
        return uniqueInstance;
    }
}
