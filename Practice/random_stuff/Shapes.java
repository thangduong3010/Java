/* Inheritance basics demo */
package random_stuff;

abstract class TwoDShape {
	private double width, height;
	private String name;
	
	// Constructor of super class
	TwoDShape(String n) {
		name = n;
	}
	
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }
	String getName() { return name; }
	
	void showDim() {
		System.out.println("Width: " + width + ", Height: " + height);
	}
	
	abstract double area();
}

// Subclass of TwoDShape
class Triangle extends TwoDShape {
	String style;
	
	// Constructor of subclass
	Triangle(String s, double w, double h) {
		super(w, h, "triangle"); // call superclass constructor
		
		style = s;
	}
		
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
	
}

class Rectangle extends TwoDShape {
	String style;
	
	Rectangle(String s, double w, double h) {
		super(w, h, "rectangle");
		
		style = s;
	}
	
	void showStyle() {
		System.out.println("Rectangle is " + style);
	}

	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		else return false;
	}
	
	double area() {
		return getWidth() * getHeight();
	}
}

class Circle extends TwoDShape {
	private double rad;
	
	Circle(double r) {
		super("Circle");
		rad = r;
	}
	
	double getRadius() { return rad; }
	void setRadius(double r) { rad = r; }
	
	double area() {
		return rad * rad * 3.14;
	}
}

class ColorTriangle extends Triangle {
	private String color;
	
	ColorTriangle(String c, String s, double w, double h) {
		super(s,w,h);
		
		color = c;
	}
	
	String getColor() { return color; }
	
	void showColor() {
		System.out.println("Color is " + color);
	}
}


public class Shapes {
	public static void main(String[] args) {
		TwoDShape shapes[] = new TwoDShape[3];
		
		shapes[0] = new Triangle("outlined", 8.0, 12.0);
		shapes[1] = new Rectangle("bold", 10.0, 10.0);
		shapes[2] = new Circle(2.5);
				
		for(int i = 0; i < shapes.length; i++) {
			System.out.println("Object is: " + shapes[i].getName());
			System.out.println("Area: " + shapes[i].area());
			System.out.println();
		}
	}
}
