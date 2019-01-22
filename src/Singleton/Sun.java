package Singleton;

public class Sun implements Planet{

	private static Sun instance;

	private Sun() {
		
	}	
	public static Sun getInstance()
	{
		if(instance == null)
			instance = new Sun();
		return instance;
	}
	
	@Override
	public double weight() {		
		return 1.989*Math.pow(10, 30);
	}
	
	@Override
	public double diameter() {
		return 1392000;
	}
	
	@Override
	public int number_of_satellites() {		
		return 0;
	}

}
