package circleCylinderLab;

public class Circle {

	private double radius;
	private String color;

	public Circle(double radius, String color) {
		super();
		setRadius(radius);
		setColor(color);
	}

	public Circle(double radius) {
		super();
		setRadius(radius);
		setColor("red");
	}

	public Circle() {
		setRadius(1.0);
		setColor("red");
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return (Math.PI * radius * radius);
	}
}
