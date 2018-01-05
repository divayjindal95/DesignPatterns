package Factory;

public class ClientCalls {
	public static void main(String args []) {
		Animal obj = BuilderFactory.getAnimal("Human");
		obj.legs();
		
		Animal obj1 = BuilderFactory.getAnimal("Dog");
		obj1.legs();
	}
}
