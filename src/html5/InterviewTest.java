package html5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InterviewTest {
	
	@Test
	public void test() {
		FirefoxDriver drv =new FirefoxDriver();
		drv.manage().window().maximize();
		drv.get("http://www.clearslide.com");
		drv.getTitle();
		System.out.println("print title");
		drv.findElement(By.xpath(""));
		drv.quit();
	}

}
