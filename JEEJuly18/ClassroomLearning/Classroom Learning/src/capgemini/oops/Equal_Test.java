package Capgemini.oops;

public class Equal_Test {
	public static void main(String[] args) {
		String name="capgemini";
		String company = new String("capgemini");
		
		if(name == company)
			System.out.println("You are an employee");
		else
			System.out.println("You are not an employee");
		
		if(name.equals(company))
			System.out.println("You are a employee");
		else
			System.out.println("You are not an employee");
		
	}

}
