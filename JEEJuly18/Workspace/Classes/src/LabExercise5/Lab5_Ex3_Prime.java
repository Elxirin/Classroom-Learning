package LabExercise5;

import java.util.Scanner;

public class Lab5_Ex3_Prime {

	public static void prime(int n) {
		
		for(int i=2; i<=n ;i++){
			boolean flag = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					//break;
				}
			}
			if(flag==true){
				System.out.print(i+ " ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number"); 
		int n = sc.nextInt();
		prime(n);
		sc.close();
	}
}
