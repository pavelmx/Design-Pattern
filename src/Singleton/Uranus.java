package Singleton;

public class Uranus implements Planet{

	private static Uranus instance;

	private Uranus() {
		
	}
	
	public static Uranus getInstance()
	{
		if(instance == null)
			instance = new Uranus();
		return instance;
	}
	
	@Override
	public double weight() {
		return 8.7*Math.pow(10, 25);
	}

	@Override
	public double diameter() {
		return 51200;
	}

	@Override
	public int number_of_satellites() {
		return 15;
	}
}
