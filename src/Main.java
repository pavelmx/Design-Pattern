import Adapter.KitchenAdapter;
import Adapter.KoreanMenu;
import Adapter.MenuOfDay;
import Adapter.RussianMenu;
import Decorator.Car;
import Decorator.cars.Audi;
import Decorator.cars.BMW;
import Decorator.cars.VW;
import Decorator.properties.PowerfulEngine;
import Decorator.properties.PremiumInterior;
import Decorator.properties.PremiumSound;
import Facade.PrintFacade;
import Facade.PrintProcess.FinishPrint;
import Facade.PrintProcess.Laser;
import Facade.PrintProcess.Paint;
import Facade.PrintProcess.Paper;
import Facade.PrintProcess.Print;
import Facade.PrintProcess.Rollers;
import Factory.FactoryOfPlanets;
import Factory.TypeOfPlanet;
import FactoryAbstract.AnimalFactory;
import FactoryAbstract.Bird;
import FactoryAbstract.BirdFactory;
import FactoryAbstract.Cat;
import FactoryAbstract.CatFactory;
import FactoryAbstract.Fish;
import FactoryAbstract.FishFactory;
import Observer.publishers.YoutubeChannel;
import Observer.subscribers.YoutubeAccountKolya;
import Observer.subscribers.YoutubeAccountPasha;
import Observer.subscribers.YoutubeAccountVasya;
import Singleton.Earth;
import Singleton.Jupiter;
import Singleton.Mars;
import Singleton.Mercury;
import Singleton.Neptune;
import Singleton.Planet;
import Singleton.Saturn;
import Singleton.Sun;
import Singleton.Uranus;
import Singleton.Venuc;
import State.CarContext;
import State.state.Acceleration;
import State.state.CarsState;
import State.state.Deceleration;
import State.state.NotUsed;
import State.state.Start;
import State.state.Stop;
import Strategy.CardsPay;
import Strategy.UserInterface;
import Strategy.WebMoneyPay;

public class Main {

	public static void print(Planet planet) {
		System.out.println(planet.getClass().getSimpleName());
		System.out.println("диаметр: " + planet.diameter());
		System.out.println("кол-во спутников: " + planet.number_of_satellites());
		System.out.println("масса: " + planet.weight());
		System.out.println();
	}

	public static void main(String args[]) {

		/**
		 * singleton
		 */
		Sun sun = Sun.getInstance();
		Mercury mercury = Mercury.getInstance();
		Venuc venuc = Venuc.getInstance();
		Earth earth = Earth.getInstance();
		Mars mars = Mars.getInstance();
		Jupiter jupiter = Jupiter.getInstance();
		Saturn saturn = Saturn.getInstance();
		Uranus uranus = Uranus.getInstance();
		Neptune neptune = Neptune.getInstance();

		print(sun);
		print(mercury);
		print(venuc);
		print(earth);
		print(mars);
		print(jupiter);
		print(saturn);
		print(uranus);
		print(neptune);

		/**
		 * factory
		 */
		FactoryOfPlanets factory = new FactoryOfPlanets();
		print(factory.createPlanet(TypeOfPlanet.MERCURY));
		print(factory.createPlanet(TypeOfPlanet.VENUC));
		print(factory.createPlanet(TypeOfPlanet.EARTH));
		print(factory.createPlanet(TypeOfPlanet.MARS));
		print(factory.createPlanet(TypeOfPlanet.JUPITER));
		print(factory.createPlanet(TypeOfPlanet.SATURN));
		print(factory.createPlanet(TypeOfPlanet.URANUS));
		print(factory.createPlanet(TypeOfPlanet.NEPTUNE));

		/**
		 * factory abstract
		 */
		AnimalFactory birdf = new BirdFactory();
		Bird bird = (Bird) birdf.createAnimal();
		bird.fly();
		AnimalFactory catf = new CatFactory();
		Cat cat = (Cat) catf.createAnimal();
		cat.bite();
		AnimalFactory fishf = new FishFactory();
		Fish fish = (Fish) fishf.createAnimal();
		fish.swim();
		System.out.println();

		/**
		 * decorator
		 */
		Car car = new PremiumInterior(new PremiumSound(new VW()));
		System.out.println(car.getName());
		System.out.print("Price: ");
		System.out.println(" = " + car.getPrice());
		System.out.println();

		Car car2 = new PremiumSound(new Audi());
		System.out.println(car2.getName());
		System.out.print("Price: ");
		System.out.println(" = " + car2.getPrice());
		System.out.println();

		Car car3 = new PowerfulEngine(new PremiumInterior(new PremiumSound(new BMW())));
		System.out.println(car3.getName());
		System.out.print("Price: ");
		System.out.println(" = " + car3.getPrice());
		System.out.println();

		/**
		 * adapter
		 */
		RussianMenu russianMenu = new RussianMenu();
		MenuOfDay menuRus = new MenuOfDay(russianMenu);
		System.out.println("Russian menu:");
		menuRus.getDayMenu();
		KitchenAdapter koreanMenu = new KitchenAdapter(new KoreanMenu());
		MenuOfDay menuKor = new MenuOfDay(koreanMenu);
		System.out.println();
		System.out.println("Korean menu:");
		menuKor.getDayMenu();
		System.out.println();

		/**
		 * facade
		 */
		// call print without facade
		Paper paper = new Paper();
		paper.putPaper();
		Paint paint = new Paint();
		paint.getPaint();
		Rollers rollers = new Rollers();
		rollers.movePaper();
		Laser laser = new Laser();
		laser.prepare();
		Print print = new Print();
		print.print();
		FinishPrint finishPrint = new FinishPrint();
		finishPrint.finish();

		// call print with facade
		PrintFacade pf = new PrintFacade();
		pf.printPhoto();
		System.out.println();

		/**
		 * observer
		 */
		YoutubeChannel channel = new YoutubeChannel();
		YoutubeAccountKolya kolya = new YoutubeAccountKolya();
		YoutubeAccountPasha pasha = new YoutubeAccountPasha();
		YoutubeAccountVasya vasya = new YoutubeAccountVasya();
		channel.addSubscriber(vasya);
		channel.addSubscriber(pasha);
		channel.addSubscriber(kolya);
		channel.createNews("Today at 5:40pm will be translation");
		System.out.println();

		/**
		 * state
		 */
		CarContext carContext = new CarContext();

		CarsState startState = new Start();
		CarsState accelerationState = new Acceleration();
		CarsState decelerationState = new Deceleration();
		CarsState stopState = new Stop();
		CarsState notUsedState = new NotUsed();

		carContext.setCarsState(startState);
		carContext.action();
		
		carContext.setCarsState(accelerationState);
		carContext.action();
		
		carContext.setCarsState(decelerationState);
		carContext.action();
		
		carContext.setCarsState(accelerationState);
		carContext.action();
		
		carContext.setCarsState(decelerationState);
		carContext.action();
		
		carContext.setCarsState(stopState);
		carContext.action();
		
		carContext.setCarsState(notUsedState);
		carContext.action();
		
		System.out.println();
		
		/**
		 * strategy
		 */
		UserInterface userInterface = new UserInterface();
		userInterface.auth("login", "pass");
		userInterface.toPay(new CardsPay("XXXX XXXX XXXX XXXX"));
		userInterface.toPay(new WebMoneyPay("ZXXXXXXXXXXXX"));
	}
}
