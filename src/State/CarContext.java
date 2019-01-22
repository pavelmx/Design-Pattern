package State;

import State.state.CarsState;

public class CarContext implements CarsState {

	private CarsState carsState;
	
	public CarsState getCarsState() {
		return carsState;
	}

	public void setCarsState(CarsState carsState) {
		this.carsState = carsState;
	}

	@Override
	public void action() {
		this.carsState.action();
	}

}
