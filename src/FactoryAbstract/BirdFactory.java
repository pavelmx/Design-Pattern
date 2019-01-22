package FactoryAbstract;

public class BirdFactory implements AnimalFactory{


	@Override
	public Animal createAnimal() {
		Bird bird = new Bird();
		return bird;
	}
}
