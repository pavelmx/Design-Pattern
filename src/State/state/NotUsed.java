package State.state;

public class NotUsed implements CarsState {

	@Override
	public void action() {
		System.out.println("Car in the garage");
	}

}
