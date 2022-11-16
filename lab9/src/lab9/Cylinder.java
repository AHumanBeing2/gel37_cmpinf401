package lab9;

public class Cylinder extends Circle{
	
	private double height = 1.0;
	
	public Cylinder() {
		super();
	}
	public Cylinder(double radius, double height) {
		super(radius);
	}
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		double volume = Circle.getArea()*height;
		return volume;
	}
	
}
