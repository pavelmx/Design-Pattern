package State.state;

public class Stop implements CarsState {

	@Override
	public void action() {
		System.out.println("Car stopped");
	}

}
