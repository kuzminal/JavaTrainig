package mypack.abstractClassTest;

public abstract class ColoredFigure {
	String color;
	int size;
	
	public ColoredFigure(String clr, int s) {
		color = clr;
		size = s;
	}
	
	void show() {
		System.out.println("Фигура : " + color + " "+ getName() );
		System.out.println("Характерный размер (" + getSizeName()+"): "+size);
		System.out.printf("Площадь : %.3f\n", getArea());
		
		String line = "";
		for (int k=1; k <= 30; k++) {
			line +="*";
		}
		System.out.println(line);
	}
	
	String getSizeName() {
		return "Сторона";
	}
	
	abstract String getName();
	abstract double getArea();
}
