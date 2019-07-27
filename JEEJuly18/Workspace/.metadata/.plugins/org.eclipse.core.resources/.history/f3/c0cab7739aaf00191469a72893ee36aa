import java.util.*;
public class Lab1_Ex4_PowerOfTwo {
	public static boolean checkNumber(int n){
		if(n==0)
			return false;
		
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==  
			       (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkNumber(n));
		sc.close();
	}
}
