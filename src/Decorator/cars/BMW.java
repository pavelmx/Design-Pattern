package Decorator.cars;

import Decorator.Car;

public class BMW implements Car {

	@Override
	public String getName() {
		return "BMW";
	}

	@Override
	public int getPrice() {
		return 15000;
	}

}
