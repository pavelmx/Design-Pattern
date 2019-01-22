package FactoryAbstract;

public class FishFactory implements AnimalFactory{


	@Override
	public Animal createAnimal() {
		Fish fish = new Fish();
		return fish;
	}
}
