package com.javaLogical;

import java.util.Scanner;

public class Logical44 {

	public static void main(String[] args) {

//		12. Hotel Room Price
//		Below ₹1,000 → Budget Room
//		₹1,000–₹2,499 → Standard Room
//		₹2,500–₹4,999 → Deluxe Room
//		₹5,000–₹9,999 → Premium Room
//		₹10,000+ → Luxury Room
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your hotel room rental:- ");
		int h=sc.nextInt();
		
		if(h<1000) {
			System.out.println("your hotel room rental is "+h+" so you have budget room");
		}
		else if(h>=1000 && h<=2499) {
			System.out.println("your hotel room rental is "+h+" so you have Standard room");
		}
		else if(h>=2500 && h<=4999) {
			System.out.println("your hotel room rental is "+h+" so you have Deluxe room");
		}
		else if(h>=5000 && h<=9999) {
			System.out.println("your hotel room rental is "+h+" so you have perium room");
		}
		else {
			System.out.println("your hotel room rental is "+h+" so you have Luxury room");
		}
		sc.close();
	}

}
