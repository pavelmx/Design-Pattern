package Singleton;

public class Earth implements Planet{

	public static Earth instance;

	private Earth() {		
	}
	
	public static Earth getInstance()
	{
		if(instance == null)
			instance = new Earth();
		return instance;
	}

	@Override
	public double weight() {		
		return 5.98*Math.pow(10, 24);
	}

	@Override
	public double diameter() {
		return 12756.3;
	}

	@Override
	public int number_of_satellites() {
		return 1;
	}
}
