package headfirst.interfacereport;

import java.io.Serializable;

public class Local extends Global implements Serializable, Runnable {
	public void localMethod() {System.out.println("Print from Local");}
	public static void main(String[] args) {
		Global gHavingGlobal = new Global();
		Global gHavingLocal = new Local();
		Local l1 = new Local();
		l1.localMethod();
//		if (gHavingGlobal instanceof Local) {
//			Local l2 = (Local) gHavingGlobal;
//			l2.localMethod();
//		}
		if (gHavingLocal instanceof Local) {
			Local l3 = (Local) gHavingLocal;
			l3.localMethod();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
