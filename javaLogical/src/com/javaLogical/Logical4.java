package com.javaLogical;

import java.util.Scanner;

public class Logical4 {

	public static void main(String[] args) {
		
		
//		Voting Eligibility
//		Enter age. If age is 18 or above, print "Eligible to vote", otherwise "Not eligible".

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("your eligible for voting");
		}
		
		else
		{
			System.out.println("your not eligible for voting");
			System.out.println("come after your age is match");
		}
		
		sc.close();
	}

}
