package th.ac.npru.swe.supatra.oop;

public abstract class Shape {
	protected String color;
	protected double area;
	abstract double getArea();
	public String toString() {
		return "\ncolor :"+color+"\nArea :"+area;
		
		
	}
    public void setColor(String colorValue) {
    	color = colorValue;
    }
}
