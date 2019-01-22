package Singleton;

public class Jupiter implements Planet{

	private static Jupiter instance;

	private Jupiter() {
		
	}
	
	public static Jupiter getInstance()
	{
		if(instance == null)
			instance = new Jupiter();
		return instance;
	}

	@Override
	public double weight() {
		return 1.9*Math.pow(10, 27);
	}

	@Override
	public double diameter() {
		return 142600;
	}

	@Override
	public int number_of_satellites() {
		return 16;
	}
}
