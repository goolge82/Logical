package com.javaLogical;

import java.util.Scanner;

public class Logical54 {

	public static void main(String[] args) {

//		22. Bank Balance
		
//		Below ₹1,000 → Very Low Balance
//		₹1,000–₹10,000 → Low Balance
//		₹10,001–₹50,000 → Average Balance
//		₹50,001–₹1,00,000 → Good Balance
//		Above ₹1,00,000 → High Balance
		
		Scanner sc=new Scanner(System.in);
		double b=sc.nextDouble();
		
		if(b<1000) {
			System.out.println("your bank balance is "+b+"rs so it is very low balance ");
		}
		else if(b>=1000 & b<=10000) {
			System.out.println("your bank balance is "+b+"rs so it is  low balance ");
		}
		else if(b>=10001 & b<=50000) {
			System.out.println("your bank balance is "+b+"rs so it is Average balance ");
		}
		else if(b>=50001 & b<=100000) {
			System.out.println("your bank balance is "+b+"rs so it is  Good balance ");
		}
		else {
			System.out.println("your bank balance is "+b+"rs so it is  Excellent balance ");

		}
		sc.close();
	}

}
