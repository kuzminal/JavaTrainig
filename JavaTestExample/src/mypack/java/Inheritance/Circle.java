package mypack.java.Inheritance;

public class Circle {
	double radius;
	String color;
	
	public Circle() {
		this.radius = 0.0;
		this.color = "white";
	}
	
	public Circle(double radius){
		this.radius = radius;
		this.color = "black";
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return 2*Math.PI*radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
