package mypack.mycollections;

public class MyArrayListTest {
	public static void main(String[] args) {
		MyArrayList strList = new MyArrayList();
		strList.add("alpha");
		strList.add("beta");
		
		for (int i = 0; i < strList.size(); ++i) {
			String str = (String)strList.get(i);
			System.out.println(str);
		}
		strList.add(new Integer(1234));
		for (int i = 0; i < strList.size(); ++i) {
			String str = (String)strList.get(i);
			System.out.println(str);
		}
	}
}
