package FactoryAbstract;

public class Bird implements Animal {

	@Override
	public void move() {
		System.out.println("bird move");
	}

	@Override
	public void eat() {
		System.out.println("bird eat");
	}

	public void fly() {
		System.out.println("bird fly");
	}
}
