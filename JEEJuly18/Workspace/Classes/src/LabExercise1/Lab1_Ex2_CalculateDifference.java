package LabExercise1;

/**
* <h1>Calculate Difference</h1>
* The Calculate Difference program implements an application that
* simply Find the difference between the sum of the squares of the 
* first n natural numbers and the square of their sum.  
* For Example if n is 10,you have to find  
* (1^2+2^2+3^2+�.9^2+10^2)-  (1+2+3+4+5�+9+10)^2 
* <p>

* @author  Piyush Nandurkar
* @version 1.0
* @since   2019-07-24 
*/

import java.util.Scanner;

public class Lab1_Ex2_CalculateDifference {
	public static int calculateDifference(int n) {
		int ss=0,Sum=0;
		
		for(int i=1;i<=n;i++){
			ss+=i*i;
		}
		for(int i=1;i<=n;i++){
			Sum+=i;
		}
		Sum=Sum*Sum;
		Sum=Sum-ss;
		return Sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = calculateDifference(n);
		System.out.println(sum);
		sc.close();
	}
}
