package com.javaLogical;

import java.util.Scanner;

public class Logical9 {

	public static void main(String[] args) {

//		Greater of Two Numbers
//		Enter two numbers and print which number is greater.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the a value:- ");
		int a=sc.nextInt();
	
		System.out.println("enter the b value:- ");
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println(a+ " is greatest number");
		}
		else {
			System.out.println(b+ " is greatest number");
		}
		
		sc.close();
	}

}
