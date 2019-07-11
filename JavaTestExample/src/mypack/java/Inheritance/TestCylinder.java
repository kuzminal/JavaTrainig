package mypack.java.Inheritance;

public class TestCylinder {
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		System.out.println("Радиус = " + c1.getRadius() + " Высота = "+
		c1.getHeight() + " Цвет = " + c1.getColor()+ " Площадь основания = "+ c1.getArea() +
		" Объем = "+ c1.getVolume());
		
		Cylinder c2 = new Cylinder(5.0, 2.0);
		System.out.println("Радиус = " + c2.getRadius() + " Высота = "+
				c2.getHeight() + " Цвет = " + c2.getColor()+ " Площадь основания = "+ c2.getArea() +
				" Объем = "+ c2.getVolume());
	}

}
