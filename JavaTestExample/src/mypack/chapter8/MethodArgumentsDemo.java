package mypack.chapter8;

public class MethodArgumentsDemo {
	static void swap(int a, int b) {
		System.out.println("Выполняется метод swap()");
		System.out.println("Аргументы до изменения значений: " + a + " и " + b);
		
		int x = b;
		b = a;
		a = x;
		
		System.out.println("Аргументы после изменения значений: " + a + " и " + b);
		System.out.println("Завершено выполнение swap");
		
	}
	
	public static void main(String[] args) {
		int m = 100, n = 200;
		
		System.out.println("Переменный до вызова метода swap(): " + m + " и " + n);
		
		swap(m, n);
		
		System.out.println("Переменный после выова метода swap(): "+ m + " и " +n);
	}
}
