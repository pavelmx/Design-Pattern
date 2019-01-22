package Decorator.properties;

import Decorator.Car;

public class PremiumSound extends Decorator {

	private Car car;
	private final int priceSound = 1000;

	public PremiumSound(Car car) {
		this.car = car;
	}

	@Override
	public String getName() {
		return car.getName() + " with premium sound";
	}

	@Override
	public int getPrice() {
		System.out.print(" + " + priceSound + "(price of sound)");
		return car.getPrice() + priceSound;
	}
	
	

}
