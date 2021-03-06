package capgemini.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyException {
	
	public static int div(int n1,int n2) throws DivisionException {
		if(n2 == 0){
			throw new DivisionException("Divide by zero Attempted ");
		}else
		{
			return n1/n2;
		}
	}
	public static void main(String[] args) {
		System.out.println("started...");
		String name = null;
		int n1,n2,res;
		n1=n2=res=0;
		try{
		//name.toLowerCase();
		//FileInputStream fileInput = new FileInputStream("C:\\Perf.txt");
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		res=div(n1,n2);
		if(args.length != 2){
			System.out.println("Please Provide two arguements");
			System.exit(0);
		}
		System.out.println("Result : " + res);
		}
		catch(DivisionException e) {
			System.err.println("Division by zero");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.err.println("String is null");
			e.printStackTrace();
		}
		/*catch(FileNotFoundException e) {
			System.err.println("The File is missing");
			e.printStackTrace();
		}*/
		catch(NumberFormatException e) { 
			System.err.println("Please Provide two Numeric arguments");
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.err.println("Denominator cannot be zero");
			e.printStackTrace();
		}
		finally{
			System.out.println("This will Surely get Executed");
		}
		
		
		System.out.println("End...");
		
		
		//Unhandled exception type FileNotFoundException
	}
}
