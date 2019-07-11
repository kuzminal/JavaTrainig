package mypack.abstractClassTest;

public class Circle extends ColoredFigure {

	public Circle(String clr, int s) {
		super(clr, s);
	}

	@Override
	String getName() {
		return "круг";
	}

	@Override
	double getArea() {
		double k = Math.PI;
		return size*size*k;
	}
	
	String getSizeName() {
		return "радиус";
	}

}
