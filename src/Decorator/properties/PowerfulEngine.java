package Decorator.properties;

import Decorator.Car;

public class PowerfulEngine extends Decorator {

	private Car car;
	private final int priceEngine = 5600;

	public PowerfulEngine(Car car) {
		this.car = car;
	}

	@Override
	public String getName() {
		return car.getName() + " with powerful engine";
	}

	@Override
	public int getPrice() {
		System.out.print(" + " + priceEngine + "(price of engine)");
		return car.getPrice() + priceEngine;
	}

	

}
