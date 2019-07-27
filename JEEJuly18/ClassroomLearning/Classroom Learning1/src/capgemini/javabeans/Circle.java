package capgemini.javabeans;

public class Circle {
	//field
	private float radius;
	
	
	//default
	public Circle() {
		//to call another constructor
		this(0.0f);
		System.out.println("Circel->def...");
	}
	
	public Circle(float radius) {
		this.radius = radius;
		System.out.println("Circel->Param");
	}
	
	private void showRadius() {
		System.out.println("Radius : "+radius);	
	}
	
	@Override
	public String toString() {
		
		return String.format("Radius is : ", radius);
	}
	 
	public static void main(String[] args){
		//declaration
		Circle c1;
		//object Instantiation
		c1=new Circle();
		//accessing field of an object
		c1.radius = 5.5f;
		//accessing method of an object
		c1.showRadius();
		System.out.println(c1.toString());
	}
}


