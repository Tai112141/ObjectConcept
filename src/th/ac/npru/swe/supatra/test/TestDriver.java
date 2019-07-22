package th.ac.npru.swe.supatra.test;

import th.ac.npru.swe.supatra.oop.Rectangle;
import th.ac.npru.swe.supatra.oop.Triangle;

public class TestDriver {

	public static void main(String[] args) {
		

		Rectangle r1 = new Rectangle(4, 6);
		r1.setColor("red");
		System.out.print("\nArea :"+r1.getArea());
		System.out.print(r1);
		
		Triangle t1 = new Triangle(4,6);
		r1.setColor("pink");
		System.out.print("\nArea :"+t1.getArea());
		t1.setColor(t1.toString());

	}

}
