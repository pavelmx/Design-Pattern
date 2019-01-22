package Factory;

import Singleton.Earth;
import Singleton.Jupiter;
import Singleton.Mars;
import Singleton.Mercury;
import Singleton.Neptune;
import Singleton.Planet;
import Singleton.Saturn;
import Singleton.Uranus;
import Singleton.Venuc;

public class FactoryOfPlanets {

	
	
	public Planet createPlanet(TypeOfPlanet typeOfPlanet) {
		
		Planet planet = null;
		
		switch(typeOfPlanet) {
			case MERCURY:
				planet = Mercury.getInstance();
				break;
			case VENUC:
				planet = Venuc.getInstance();
				break;
			case EARTH:
				planet = Earth.getInstance();
				break;
			case MARS:
				planet = Mars.getInstance();
				break;
			case JUPITER:
				planet = Jupiter.getInstance();
				break;
			case SATURN:
				planet = Saturn.getInstance();
				break;
			case URANUS:
				planet = Uranus.getInstance();
				break;
			case NEPTUNE:
				planet = Neptune.getInstance();
				break;
		}
			return planet;			
	}
	
}
