package com.javaLogical;

import java.util.Scanner;

public class Logical24 {

	public static void main(String[] args) {
		
//		Number Greater Than 100 – Check whether a number is greater than 100.

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number:- ");
		
		int n=sc.nextInt();
		
		if(n>100) {
			System.out.println(n+" it is greater than 100");
		}
		else {
		System.out.println(n+" it is lesser than 100");
	}
		
		sc.close();
	}		

}
