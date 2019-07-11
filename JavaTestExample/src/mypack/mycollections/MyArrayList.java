package mypack.mycollections;

import org.omg.CORBA.OBJ_ADAPTER;

public class MyArrayList {
	private int size;
	private Object[] elements;
	
	public MyArrayList() {
		elements = new Object[10];
		size = 0;
	}
	
	public void add(Object o) {
		if (size < elements.length) {
			elements[size] = o;
		} else {
			
		}
		size++;
	}
	
	public Object get(int index) {
		if (index >= size) 
			throw new IndexOutOfBoundsException("Индекс " + index + ", Размер " + size);
		return elements[index];
	}
	
	public int size() {return size;}
}
