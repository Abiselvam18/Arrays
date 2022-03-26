package com.arrays;

import java.util.Scanner;

public class ArrayElements {
	
	public static void main(String args[]) {
		
			int ar[]=new int[5]; 
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter array elements "+ar.length);
			//input elements into array
			for(int i=0;i<ar.length;i++) {
				ar[i]=sc.nextInt();
			}
			//Displaying array elements
			System.out.println("Array elements are");
			for(int i=0;i<5;i++) {
				System.out.println(ar[i]);
			}
			
			//sum
			System.out.println("sum of all array elements");
			int s=0;
			for(int i=0;i<ar.length;i++) {
				s=s+ar[i];
			}
			System.out.println("sum="+s);
			
			System.out.println("average "+(float)s/ar.length);

			//find maximum of array elements
			int max=ar[0];
			for(int i=1;i<ar.length;i++) {
				if(ar[i]>max) {
					max=ar[i];
				}
			}
			
			System.out.println("Maximum of array element is"+max);

			//find minimum of array element
					int min=ar[0];
					for(int i=1;i<ar.length;i++) {
						if(ar[i]<min) {
							min=ar[i];
						}
					}
					
					System.out.println("minimum of array element is"+min);
					
}
}
