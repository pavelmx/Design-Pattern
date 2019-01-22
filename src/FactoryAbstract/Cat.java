package FactoryAbstract;

public class Cat implements Animal {

	@Override
	public void move() {
		System.out.println("cat move");
	}

	@Override
	public void eat() {
		System.out.println("cat eat");
	}

	public void bite() {
		System.out.println("cat bite");
	}
}
