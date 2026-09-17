package com.javaLogical;

import java.util.Scanner;

public class Logical17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		minimum balance
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the amount:- ");
		
		double a=sc.nextDouble();
		
		if(a>=1000) {
			System.out.println(a+" you have minimum account balance");
		}
		
		else {
			System.out.println(a+" you do not have minimum account balance");
			System.out.println(" so if you did not maintain minimum balance every month last remaining amount will be deducted");
		}
		
		sc.close();

	}

}
