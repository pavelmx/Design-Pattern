package Decorator.properties;

import Decorator.Car;

public class PremiumInterior extends Decorator{

	private Car car;
	private final int priceInterior = 2500;
	
	public PremiumInterior(Car car) {
		this.car = car;
	}
	
	@Override
	public String getName() {
		return car.getName() + " with premium interior";
	}

	@Override
	public int getPrice() {
		System.out.print(" + " + priceInterior + "(price of interior)");
		return car.getPrice() + priceInterior;
	}
	
	

}
