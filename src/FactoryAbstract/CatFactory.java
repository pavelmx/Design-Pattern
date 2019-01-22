package FactoryAbstract;

public class CatFactory implements AnimalFactory{


	@Override
	public Animal createAnimal() {
		Cat cat = new Cat();
		return cat;
	}
}
