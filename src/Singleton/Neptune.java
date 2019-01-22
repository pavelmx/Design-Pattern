package Singleton;

public class Neptune implements Planet{

	private static Neptune instance;

	private Neptune() {
		
	}
	
	public static Neptune getInstance()
	{
		if(instance == null)
			instance = new Neptune();
		return instance;
	}
	
	@Override
	public double weight() {
		return 1.03*Math.pow(10, 26);
	}

	@Override
	public double diameter() {
		return 49500;
	}

	@Override
	public int number_of_satellites() {
		return 6;
	}
}
