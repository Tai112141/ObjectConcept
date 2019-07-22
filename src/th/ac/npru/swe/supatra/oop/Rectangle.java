package th.ac.npru.swe.supatra.oop;

public class Rectangle extends Shape {
	int length;
	int width;

	Rectangle(int lengValue, int widthValue) {
		length = lengValue;
		width = widthValue;
	}

	@Override
	double getArea() {
		area = length * width;
		return 0;
	}

}
