package LabExercise3;

import java.util.Scanner;

public class Lab3_Ex1SecondSamallest {
	
	public static int getSecondSmallest(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[i]>a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		/*for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}*/
		return a[a.length-2];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		System.out.println(getSecondSmallest(a));	
		sc.close();
	}
}
