package com.javaLogical;

import java.util.Scanner;

public class Logical41 {

	public static void main(String[] args) {

//		9. Mobile Battery
		
//		0–10% → Critical
//		11–30% → Low
//		31–60% → Medium
//		61–90% → Good
//		91–100% → Full
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your mobile battery:- ");
		int b=sc.nextInt();
		
		if(b>=0 && b<=10) {
			System.out.println("your battery is "+b+" so your mobile is in critical");
		}
		else if(b>=10 && b<=30) {
			System.out.println("your battery is "+b+" so your mobile is in Low");
		}
		else if(b>=31 && b<=60) {
			System.out.println("your battery is "+b+" so your mobile is in Medium");
		}
		else if(b>=61 && b<=90) {
			System.out.println("your battery is "+b+" so your mobile is in good");
		}
		else {
			System.out.println("your battery is "+b+" so your mobile is in full");
		}
		sc.close();
	}

}
