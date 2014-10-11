package headfirstdp.chapter12;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();        
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("Duck Simulator: With Observer");
		Quackologist quackologist = new Quackologist();
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		flockOfDucks.registerObserver(quackologist);
		
		Flock flockOfMallards = new Flock();
		Quackable mallardDuckOne = duckFactory.createMallardDuck();
		Quackable mallardDuckTwo = duckFactory.createMallardDuck();
		Quackable mallardDuckThree = duckFactory.createMallardDuck();
		Quackable mallardDuckFour = duckFactory.createMallardDuck();
		
		flockOfMallards.add(mallardDuckOne);
		flockOfMallards.add(mallardDuckTwo);
		flockOfMallards.add(mallardDuckThree);
		flockOfMallards.add(mallardDuckFour);
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("Duck Simulator: Whole Flock Simulator");
		simulate(flockOfDucks);
		
		System.out.println("Duck Simulator: Mallard Flock Simulator");
		simulate(flockOfMallards);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() +
				" times.");
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}
}
