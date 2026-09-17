package com.javaLogical;

import java.util.Scanner;

public class Logical7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Even or Odd
//		Enter a number. Check whether the number is even or odd.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number:- ");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" is even number");
		}
		
		else {
			System.out.println(n+ " is odd number");
//			for odd --> n%2!=0
		}
		
		sc.close();

	}

}
