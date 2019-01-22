package Decorator.cars;

import Decorator.Car;

public class Audi implements Car {

	@Override
	public String getName() {
		return "Audi";
	}

	@Override
	public int getPrice() {		
		return 13500;
	}

}
