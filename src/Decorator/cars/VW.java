package Decorator.cars;

import Decorator.Car;

public class VW implements Car {

	@Override
	public String getName() {
		return "Volkswagen";
	}

	@Override
	public int getPrice() {
		return 10000;
	}

}
