package com.arrays;

import java.util.Scanner;

public class MainArrayMain {

	public static void main(String[] args) {
				
		//datatype vari_name[]=new datatype[size];
		int ar[]=new int[5];  //declaration
		/*ar[0]=34;  //ar->subscript  0->index
		ar[1]=37;
		ar[2]=56;
		ar[3]=78;
		ar[4]=12;
		*/
		/*System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		*/
		
		
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
		
      }

}
