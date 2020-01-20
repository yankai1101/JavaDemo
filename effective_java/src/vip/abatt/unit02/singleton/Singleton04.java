package vip.abatt.unit02.singleton;

/**
 * Author:yankai1101
 * Desc:
 * 双重检验锁
 **/
public class Singleton04 {
    private static volatile Singleton04 instance = null;

    private Singleton04() {
    }

    public static Singleton04 getInstance() {
        if (instance == null) {
            synchronized (Singleton04.class) {
                if (instance == null)
                    instance = new Singleton04();
            }
        }
        return instance;
    }

    public void method() {
        System.out.println("Singleton04");
    }
}
