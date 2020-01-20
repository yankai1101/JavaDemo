package vip.abatt.unit02.singleton;

public class Singleton03 {
	private static Singleton03 instance;

	private Singleton03() {
	}

	public static Singleton03 getInstance() {
		if (instance == null)
			instance = new Singleton03();
		return instance;
	}

	public void method() {
		System.out.println("Singleton03");

	}
}
