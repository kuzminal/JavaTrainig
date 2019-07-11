package mypack.chapter8;

public class SwapFieldsDemo {
	static void swap(MyClass A, MyClass B) {
		System.out.println("Выполняется метов swap()");
		System.out.println("Объект А : " + A.number);
		System.out.println("Объект B : " + B.number);
		
		int number = B.number;
		B.number = A.number;
		A.number = number;
		
		System.out.println("Значения полей изменены");
		System.out.println("Объект А : " + A.number);
		System.out.println("Объект B : " + B.number);
		System.out.println("Завершено выполнение метода swap()");
		
	}
	
	public static void main (String[] args) {
		MyClass A = new MyClass(100);
		MyClass B = new MyClass(200);
		
		System.out.println("Переменный до вызова метода swap(): " + A.number + " и " + B.number);
		
		swap(A, B);
		
		System.out.println("Переменный после выова метода swap(): "+ A.number + " и " +B.number);
	}

}
