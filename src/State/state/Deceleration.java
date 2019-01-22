package State.state;

public class Deceleration implements CarsState {

	@Override
	public void action() {
		System.out.println("Car brakes :(");
	}

}
