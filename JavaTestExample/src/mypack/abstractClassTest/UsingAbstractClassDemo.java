package mypack.abstractClassTest;

public class UsingAbstractClassDemo {
	public static void main(String[] args) {
		Triangle T = new Triangle("красный", 2);
		Square S = new Square("черный", 3);
		Circle C = new Circle("желтый", 1);
		
		System.out.println("Использование объектных переменных подкласса");
		
		T.show();
		C.show();
		S.show();
		
		ColoredFigure F;
		F = T;
		F.show();
		F = S;
		F.show();
		F = C;
		F.show();
	}
}
