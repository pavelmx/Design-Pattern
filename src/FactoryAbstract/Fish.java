package FactoryAbstract;

public class Fish implements Animal {

	@Override
	public void move() {
		System.out.println("fish move");
	}

	@Override
	public void eat() {
		System.out.println("fish eat");
	}

	public void swim() {
		System.out.println("fish swim");
	}
}
