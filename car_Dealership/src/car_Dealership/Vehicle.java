package car_Dealership;

public class Vehicle {
	private String model;
	private double price;
	private String color;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Vehicle [model=" + model + ", price=" + price + ", color=" + color + "]";
	}
}
