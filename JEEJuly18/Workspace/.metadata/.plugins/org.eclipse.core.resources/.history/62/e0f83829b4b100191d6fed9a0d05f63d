package LabExercise4;
import java.util.Scanner;

public class Lab4_Ex1_Operators {
	public static int sumOfCubes(int n) {
		String str = Integer.toString(n);
		String digit[] = str.split("");
		int sum = 0;
		for (String d : digit) {
			int x = Integer.parseInt(d);
			x = x * x * x;
			sum += x;
		}
		return sum;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sumOfCubes(n));
	}
}
