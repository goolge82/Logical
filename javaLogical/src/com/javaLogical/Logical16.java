package com.javaLogical;

import java.util.Scanner;

public class Logical16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Discount Eligibility
//		Enter shopping amount. If amount is ₹5,000 or above, give a discount; otherwise, no discount.

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the amount:- ");
		int a=sc.nextInt();
		
		if(a>=5000) {
			System.out.println("shopping amount is "+a+ " so you will get  discount");
		}
		else {
		
		System.out.println("shopping amount is "+a+ " so discount your not eligible");
	}
	sc.close();
	}

}
