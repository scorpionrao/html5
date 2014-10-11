package headfirst.side.java;

public class IE {
	public static void main(String[] args) {
//		WebDriver driver = new InternetExplorerDriver();
//		System.setProperty("webdriver.ie.driver",
//			"\\Users\\rgonugunta\\Documents\\untitledfolder");
//		driver.get("http://www.clearslide.com");
		System.out.println(String.format("%05d", 1));
		IE ie = new IE();
		System.out.println("Get Class - " + ie.getClass());
		System.out.println("Get Class Name - " + ie.getClass().getName());
		System.out.println("Get Package - " + ie.getClass().getPackage());
		System.out.println("Get Package Name - " + ie.getClass().getPackage().getName());
		System.out.println("Get Primitive Name - " + new Integer(7).getClass().getName());
	}
}
