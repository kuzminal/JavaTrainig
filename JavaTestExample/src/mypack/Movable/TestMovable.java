package mypack.Movable;

import javax.management.MBeanAttributeInfo;

public class TestMovable {
	public static void main(String[] args) {
		MovalbePoint mp = new MovalbePoint(1, 2);
		System.out.println(mp);
		mp.moveDown();
		System.out.println(mp);
		mp.moveRight();
		System.out.println(mp);
		
		MovalbePoint mp2 = new MovalbePoint(3, 4);
		mp2.moveUp();
		System.out.println(mp);
		MovalbePoint mp3 = (MovalbePoint) mp2;
		System.out.println(mp3);
	}
}
