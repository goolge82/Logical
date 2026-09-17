package com.javaLogical;

import java.util.Scanner;

public class Logical12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Divisible by 5
//		Check whether a number is divisible by 5.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number:- ");
		int n=sc.nextInt();
		
		if(n%5==0) {
			System.out.println(n+ " is divisible by 5");
		}
		else {
			System.out.println(n+ " is not divisible by 5");
		}
		
		sc.close();

	}

}
