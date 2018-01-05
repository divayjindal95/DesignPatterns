package AbstractFactory;

public abstract class CreateAnimal {
	abstract Reproduction reproduction(String reprod);
	abstract Limbs limbs(String limbs);
}
