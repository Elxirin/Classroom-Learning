package Capgemini.oops;

class Circle {
	// Field...
	float radius;

	// Constructors..
	public Circle() {
		radius = 0.0f;
		System.out.println("Circle->def...");
	}

	// Constructor Overloading
	public Circle(float pradius) {
		radius = pradius;
		System.out.println("Circle->Parameter");
	}

	// methods
	public void draw() {
		System.out.println("circle is drawn..");
	}

	public double calcArea() {
		return radius * radius * Math.PI;
	}

	// method overriding from parent Object Class
	@Override // java Annotation:Instructions For Compiler
	public String toString() {
		return "Radius:" + radius;
	}
}

public class Circle_Test {
	public static void main(String[] args) {
		//Declaration...
		Circle c1,c2;
		
		//Object instantiation
		c1 = new Circle();
		c2 = new Circle(5.5f);
		
		//Calling instance methods..
		c1.draw();
		System.out.println("c1 Area:"+ c1.calcArea());
		
		c2.draw();
		System.out.println("c1 Area:"+ c2.calcArea());
		
		System.out.println(c1);
		System.out.println(c2.toString());
		
	}
}
