package com.javaLogical;

import java.util.Scanner;

public class Logical20 {

	public static void main(String[] args) {
		
//		Electricity Bill
//		Enter units consumed. If units are greater than 100, apply a higher charge; otherwise, apply a normal charge.

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the units:- ");
		double u=sc.nextDouble();
		
		if(u>100) {
			
			System.out.println("you use "+ u + "units so you will get high electrical charges");
			
		}
		else {
			System.out.println("you use "+ u + "units so you will get normal electrical charges");
		}
		sc.close();
	}

}
