package Capgemini.oops;
public class Student{
	int rollNo;
	String name;
	final Double OUT_OF_MARKS=300.00;
	Double marks;
	
	public Student(){
		rollNo=0;
		name=null;
		marks=0.0;
	}
	public Student(int rno,String nam,Double mk){
		rollNo=rno;
		name=nam;
		marks=mk;
	}
	
	public void display(){
		System.out.println("Roll No. : "+rollNo+"\nName : "+name+"\nMarks : "+marks);
	}
	
	public String calcGrade(){
		if(this.calcPercentage()>=85){
			return "A";
		}
		else if(this.calcPercentage()>=65){
			return "B";
		}
		else if(this.calcPercentage()>=45){
			return "C";
		}
		else return "Fail";
		
	}	
	public double calcPercentage(){
		return ((this.marks/OUT_OF_MARKS)*100);
	}

	public void printMarksheet(){
		this.display();
		System.out.println(this.calcGrade());
	}

		

	public static void main(String[] args){
		//Student s1 = new Student(101,"Aditya Ranade",178);
		//s1.printMarksheet();	
	}
}