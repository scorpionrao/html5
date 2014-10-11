package headfirst.side.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import junit.extensions.TestSetup;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Junit3Test1 extends TestCase {
	static WebDriver driver;
	public static Test suite() {
		return new TestSetup(new TestSuite(Junit3Test1.class)) {
			protected void setUp() throws Exception {
				System.out.println("Before Class");
				driver = new FirefoxDriver();
			}
			protected void tearDown() throws Exception {
				System.out.println("After Class");
				driver.quit();
			}
		};
	}
	protected void setUp() {
		System.out.println("Setup - " + this.getClass().getName());
		driver.get("www.orkut.com");
	}
	protected void tearDown() {
		System.out.println("TearDown - " + this.getClass().getName());
//		driver.get("www.gmail.com");
		
	}
	public void testCase1() {
		System.out.println("TC1 - " + this.getClass().getName());
//		driver.get("www.facebook.com");
	}
	public void testCase2() {
		System.out.println("TC2 - " + this.getClass().getName());
//		driver.get("www.twitter.com");
	}
	public void testCase3() {
		System.out.println("TC3 - " + this.getClass().getName());
//		driver.get("www.espn.com");
	}
}
