package State.state;

public class Start implements CarsState {

	@Override
	public void action() {
		System.out.println("Car is ready to go");
	}

}
