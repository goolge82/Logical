package com.javaLogical;

import java.util.Scanner;

public class Logical15 {

	public static void main(String[] args) {
		
//		leap year
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the year:- ");
		int year=sc.nextInt();
		
		if(year%4==0) {
			System.out.println(year+" it is a leap year");
		}

		else {
		System.out.println(year+" it is not a leap year");
	}
		
		sc.close();
	}

}
