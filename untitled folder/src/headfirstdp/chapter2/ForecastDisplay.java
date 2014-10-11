package headfirstdp.chapter2;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	WeatherData weatherData;

	public ForecastDisplay(Observable observable) {
		weatherData = (WeatherData) observable;
		weatherData.addObserver(this);
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
		}
		display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
