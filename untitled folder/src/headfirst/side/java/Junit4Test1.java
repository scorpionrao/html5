package headfirst.side.java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Junit4Test1 {
	static WebDriver driver = null;
	static long timeout = 2000;
	@BeforeClass
	public static void beforeClass() throws InterruptedException {
		driver = new FirefoxDriver();
	}
	@AfterClass
	public static void afterClass() throws InterruptedException {
		driver.quit();
	}
	@Before
	public void beforeMethod() throws InterruptedException {
		driver.get("http://www.facebook.com");
	}
	@After
	public void afterMethod() throws InterruptedException {
		// nothing required right now
	}
	@Test
	public void testCase1() throws InterruptedException {
		Assert.assertNotNull(driver.findElement(By.id("email")));
		Assert.assertNotNull(driver.findElement(By.id("passwd")));
	}
	@Test
	public void testCase2() throws InterruptedException {
		// some other test case
	}

}