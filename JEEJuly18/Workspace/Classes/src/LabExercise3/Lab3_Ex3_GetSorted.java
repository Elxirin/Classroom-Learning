package LabExercise3;

import java.util.Scanner;

public class Lab3_Ex3_GetSorted {
	
	public static int[] getSorted(int[] a) {
		for(int i=0;i<a.length;i++) {
			String temp = new StringBuilder(Integer.toString(a[i])).reverse().toString();
			a[i]= Integer.parseInt(temp);
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[i]<a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		a = getSorted(a);
		for(int i =0;i<n;i++) {
			System.out.print(a[i] + " ");
		}
		
		sc.close();
	}
}