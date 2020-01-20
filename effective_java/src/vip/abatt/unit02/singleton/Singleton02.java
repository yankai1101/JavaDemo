package vip.abatt.unit02.singleton;

public class Singleton02 {
    public static Singleton02 INSTANCE = new Singleton02();

    private Singleton02() {
    }

    public void method() {
        System.out.println("Singleton02");
    }
}
