package html5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YouTube {

	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i<50; i++) {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.youtube.com/watch?v=nsA9MVD3qDM");
			Thread.currentThread().sleep(6000);
			driver.quit();
			Thread.currentThread().sleep(6000);
		}
	}

}
