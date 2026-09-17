package com.javaLogical;

import java.util.Scanner;

public class Logical6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Positive or Negative
//		Enter a number. Check whether it is positive or negative.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		int n=sc.nextInt();
		
		if(n>=0) {
			System.out.println(n+" is positive number");
		}
		else {
			System.out.println(n+" is negative number");
		}

		sc.close();
	}

}
