package Singleton;

public class Mars implements Planet{

	private static Mars instance;

	private Mars() {
		
	}
	
	public static Mars getInstance()
	{
		if(instance == null)
			instance = new Mars();
		return instance;
	}
	
	@Override
	public double weight() {
		return 6.44*Math.pow(10, 23);
	}

	@Override
	public double diameter() {
		return 6780;
	}

	@Override
	public int number_of_satellites() {
		return 2;
	}
}
