package headfirstdp.chapter12;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	public static int getQuacks() {
		return numberOfQuacks;
	}
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}
}
