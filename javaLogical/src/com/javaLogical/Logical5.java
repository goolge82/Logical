package com.javaLogical;

import java.util.Scanner;

public class Logical5 {

	public static void main(String[] args) {
		
		
//		Driving Eligibility
//		Enter age. If age is 18 or above, print "Eligible for driving license".
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the age:- ");
		int age=sc.nextInt();
		
		if(age>=18)
			System.out.println("your eligible for driving");
		
		else
			System.out.println("your not eligible for driving");
		
		sc.close();

	}

}
