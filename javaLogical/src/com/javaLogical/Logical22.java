package com.javaLogical;

import java.util.Scanner;

public class Logical22 {
	
//	Adult or Minor – Check whether age is 18 or above.

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the age:- ");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("your adult so you can go any where");
		}
		
		else {
			System.out.println("your minor so you can't go any where");
			System.out.println("you have to stay in home");
		}
		
		sc.close();

	}

}
