package com.javaLogical;

import java.util.Scanner;

public class Logical46 {

	public static void main(String[] args) {

//		14. Battery Charging Time
		
//		0–30 minutes → Quick
//		31–60 minutes → Normal
//		61–120 minutes → Long
//		Above 120 minutes → Very Long
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your mobile battery charging time:- ");
		int c=sc.nextInt();
		
		if(c>=0 && c<=30) {
			System.out.println("your mobile charging time is "+c+"min so your mobile have quick charging capacity");
		}
		else if(c>=31 && c<=60) {
			System.out.println("your mobile charging time is "+c+"min so your mobile have Normal charging capacity");
		}
		else if(c>=61 && c<=120) {
			System.out.println("your mobile charging time is "+c+"min so your mobile have long charging capacity");
		}
		else {
			System.out.println("your mobile charging time is "+c+"min so your mobile have very long charging capacity.");
			System.out.println("so you have to buy new Iphone pro max other wise it will become diffcult");
		}
		
		sc.close();
	}

}
