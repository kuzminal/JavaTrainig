package mypack.generic;

public class TestGenericBox {
	public static void main(String[] args) {
		GenericBox<String> box1 = new GenericBox<String>("Привет!");
		String str = box1.toString();
		System.out.println(box1);
		
		GenericBox<Integer> box2 = new GenericBox<Integer>(123);
		int i = box2.getContent();
		
		System.out.println(box2);
		GenericBox<Double> box3 = new GenericBox<Double>(55.66);
		double d = box3.getContent();
		System.out.println(box3);
	}
}
