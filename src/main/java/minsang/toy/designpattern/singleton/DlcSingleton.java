package minsang.toy.designpattern.singleton;

public class DlcSingleton {

    private volatile static DlcSingleton uniqueInstance;

    private DlcSingleton() {
    }

    public static DlcSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DlcSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}