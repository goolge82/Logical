package com.javaLogical;

import java.util.Scanner;

public class Logical8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Pass or Fail
//		Enter marks. If marks are 50 or above, print "Pass", otherwise "Fail".
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the marks:- ");
		int marks=sc.nextInt();
		
		if(marks>50) {
			System.out.println("you got "+marks+" so your pass");
		}
		else {
			System.out.println("you got "+marks+" so your fail");

		}
		
		sc.close();

	}

}
