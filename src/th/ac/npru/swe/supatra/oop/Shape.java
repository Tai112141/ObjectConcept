package th.ac.npru.swe.supatra.oop;

public abstract class Shape {
	String color;
	double area;
	abstract double getArea();
	public String toString() {
		return "color :"+color+"\nArea :"+area;
		
		
	}
    void setColor(String colorValue) {
    	color = colorValue;
    }
}
