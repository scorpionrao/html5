package headfirst.main.guitar;

public class Guitar {
	public String serialNumber;
	public double price;
	public Builder builder;
	public String model;
	public Type type;
	public Wood backWood;
	public Wood topWood;
	
	public Guitar(String serialNumber,
		double price, Builder builder,
		String model, Type type,
		Wood backWood, Wood topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public Builder getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	
	
}
