package Singleton;

public class Venuc implements Planet{

	private static Venuc instance;

	private Venuc() {
		
	}
	
	public static Venuc getInstance()
	{
		if(instance == null)
			instance = new Venuc();
		return instance;
	}
	
	@Override
	public double weight() {
		return 4.9*Math.pow(10, 24);
	}

	@Override
	public double diameter() {
		return 6050;
	}

	@Override
	public int number_of_satellites() {
		return 0;
	}
}
