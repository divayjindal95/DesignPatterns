package Factory;

public class BuilderFactory {
	
	public static Animal getAnimal(String type) {
		
		if(type.equals("Human"))
			return new Human();
		
		if(type.equals("Dog"))
			return new Dog();
		
		return null;
	}
}
