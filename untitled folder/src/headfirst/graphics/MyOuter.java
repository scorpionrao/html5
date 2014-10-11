package headfirst.graphics;

public class MyOuter {
	private int x;
	MyInner inner = new MyInner();
	public void aMethod() {
		//MyInner innerObjectInsideMethod = new MyInner();
	}
	public class MyInner {
		public void go() {
			x = 42;
		}
	}
	public static void main(String[] args) {
		MyOuter outer = new MyOuter();
		MyOuter.MyInner innerObject = outer.new MyInner();
		innerObject.go();
		outer.x = 100;
	}
}
