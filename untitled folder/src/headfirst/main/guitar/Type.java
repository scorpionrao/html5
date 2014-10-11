package headfirst.main.guitar;

public enum Type {
	ACOUSTIC ("acoustic"),
	ELECTRIC ("electric");
	
	String toString;
	Type(String toString) {
		this.toString = toString;
	}
	public String toString1() {
		return this.toString;
	}
	
//	ACOUSTIC,
//	ELECTRIC;
//	public String toString2() {
//		switch(this) {
//		case ACOUSTIC: return "acoustic";
//		case ELECTRIC: return "electric";
//		default: return null;
//		}
//	}
	
}
