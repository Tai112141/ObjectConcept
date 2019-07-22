package th.ac.npru.swe.supatra.oop;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle(int lengValue, int widthValue) {
		length = lengValue;
		width = widthValue;
	}

	@Override
	public double getArea() {
		area = length * width;
		return 0;
	}

}
