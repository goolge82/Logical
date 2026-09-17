package com.javaLogical;

import java.util.Scanner;

public class Logical23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Free Delivery or Paid Delivery – Check whether order amount is above ₹500.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the amouunt:- ");
		double a=sc.nextInt();
		
		if(a>=500) {
			System.out.println("you will get free deilivery");
		}
		else {
			System.out.println("you will get paid deilivery ");
		}
		
		sc.close();
	}

}
