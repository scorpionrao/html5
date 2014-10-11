package headfirst.interfacereport;

public class BuzzwordsReport extends Report {
	void runReport() {
		super.printReport();
//		System.out.println("Run report from BuzzwordsReport class");
	}
	public static void main(String[] args) {
		new BuzzwordsReport().runReport();
	}
}
