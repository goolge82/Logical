package com.javaLogical;

import java.util.Scanner;

public class Logical40 {

	public static void main(String[] args) {

//		8. Shopping Discount
		
//		Below ₹1,000 → No Discount
//		₹1,000–₹2,999 → 5% Discount
//		₹3,000–₹4,999 → 10% Discount
//		₹5,000–₹9,999 → 15% Discount
//		₹10,000+ → 20% Discount
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your shopping amount:- ");
		double s=sc.nextDouble();
		
		if(s<1000) {
			System.out.println("you did shopping "+s+" so you didn't get discount");
		}
		else if(s>=1000 && s<=2999) {
			System.out.println("you did shopping "+s+" so you will get 5% discount");
		}
		else if(s>=3000 && s<=4999) {
			System.out.println("you did shopping "+s+" so you will get 10% discount");
		}
		else if(s>=5000 && s<=9999) {
			System.out.println("you did shopping "+s+" so you will get 15% discount");
		}
		else {
			System.out.println("you did shopping "+s+" so you will get 20% discount");
		}
		sc.close();
	}

}
