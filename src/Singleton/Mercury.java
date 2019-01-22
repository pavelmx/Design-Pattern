package Singleton;

public class Mercury implements Planet{

	private static Mercury instance;

	private Mercury() {
		
	}
	
	public static Mercury getInstance()
	{
		if(instance == null)
			instance = new Mercury();
		return instance;
	}
	
	@Override
	public double weight() {
		return 3.3*Math.pow(10, 23);
	}

	@Override
	public double diameter() {
		return 4878;
	}

	@Override
	public int number_of_satellites() {
		return 0;
	}
}
