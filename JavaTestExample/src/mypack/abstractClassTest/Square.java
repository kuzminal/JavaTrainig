package mypack.abstractClassTest;

public class Square extends ColoredFigure {

	public Square(String clr, int s) {
		super(clr, s);
	}

	@Override
	String getName() {
		return "квадрат";
	}

	@Override
	double getArea() {
		double k =1 ;
		return size*size*k;
	}

}
