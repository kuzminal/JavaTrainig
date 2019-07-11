package mypack.abstractClassTest;

public class Triangle extends ColoredFigure {

	public Triangle(String clr, int s) {
		super(clr, s);
	}

	@Override
	String getName() {
		return "треугольник";
	}

	@Override
	double getArea() {
		double k = Math.sqrt(3)/4;
		return size*size*k;
	}

}
