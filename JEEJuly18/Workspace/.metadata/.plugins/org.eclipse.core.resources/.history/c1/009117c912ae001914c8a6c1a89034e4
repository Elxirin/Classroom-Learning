
/**
* <h1>Calculate Sum</h1>
* The CalculateSum program implements an application that
* simply gives a sum of first n natural numbers divisible by 3 or 5
* <p>

* @author  Piyush Nandurkar
* @version 1.0
* @since   2019-07-24 
*/

import java.util.Scanner;

public class Lab1_Ex1_CalculateSum {
	public static int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = calculateSum(n);
		assert sum<=60:"Not Valid";
		System.out.println(sum);
		sc.close();
	}
}
