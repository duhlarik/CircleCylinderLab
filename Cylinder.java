package circleCylinderLab;

public class Cylinder extends Circle {
	
	private double height = 1.0;

	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		setHeight(height);
	}

	public Cylinder(double radius, double height) {
		super(radius);
		setHeight(height);
	}
	
	public Cylinder(double radius) {
		super(radius);
		setHeight(1.0);
	}
	
	public Cylinder() {
		super();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getCylinderArea() {
		return (2 * Math.PI * getRadius() * height) + (2 * getArea());
	}
	
	public double getVolume() {
		return height * getArea();
	}

}
