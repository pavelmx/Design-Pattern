package Singleton;

public class Saturn implements Planet{

	private static Saturn instance;

	private Saturn() {
		
	}
	
	public static Saturn getInstance()
	{
		if(instance == null)
			instance = new Saturn();
		return instance;
	}
	
	@Override
	public double weight() {
		return 5.68*Math.pow(10, 26);
	}

	@Override
	public double diameter() {
		return 120660;
	}

	@Override
	public int number_of_satellites() {
		return 30;
	}
}
