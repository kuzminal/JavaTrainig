package mypack.mycollections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("alpha");
		list.add("beta");
		list.add("charlie");
		System.out.println(list);
		
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			String str = (String)iter.next();
			System.out.println(str);
		}
	}

}
