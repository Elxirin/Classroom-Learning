package capgemini.javabeans;

public class Rectangle {
	//field
	private float length,breadth;
	
	//default..
	public Rectangle() {
		//to call another constructor..
		this(0.0f,0.0f);
		System.out.println("Rectangle->def...");
	}
	
	public Rectangle(float length, float breadth) {
		//this.length = length;
		//this.breadth = breadth;
		setLength(length);
		setBreadth(breadth);
		System.out.println("Rectangle->param...");
	}
	
	//setter method
	public void setLength(float length) {
		if(length>0){
			this.length = length;
		}
	}
	
	public void setBreadth(float breadth) {
		if(breadth>0) {
			this.breadth = breadth;
		}
	}
	
	//getter methods
	public float getBreath() {
		return breadth;
	}
	
	public float getLength() {
		return length;
	}
	
	
	
}
