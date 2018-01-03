package Singleton;

public class Singleton {
	
	public static Singleton instance;
	
	private Singleton() {};
	
	public void print() {
		System.out.println("my object");
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
			return instance;
		}
		else {
			System.out.println("not creating instance");
			return null;
		}
	}
}
