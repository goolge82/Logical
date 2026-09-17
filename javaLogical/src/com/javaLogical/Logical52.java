package com.javaLogical;

import java.util.Scanner;

public class Logical52 {

	public static void main(String[] args) {

//		20. Daily Study Hours
		
//		0–1 hour → Very Low
//		2–3 hours → Low
//		4–5 hours → Good
//		6–8 hours → Very Good
//		Above 8 hours → Excellent
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your study hour time:- ");
		int h=sc.nextInt();
		
		if(h>=0 && h<=1) {
			System.out.println("your studying nearly "+h+"hours it is very low ");
		}
		else if(h>=2 && h<=3) {
			System.out.println("your studying nearly "+h+"hours it is low ");
		}
		else if(h>=4&& h<=5) {
			System.out.println("your studying nearly "+h+"hours it is Good ");
		}
		else if(h>=6 && h<=8) {
			System.out.println("your studying nearly "+h+"hours it is very good ");
		}
		else {
			System.out.println("your studying nearly "+h+"hours it is Excellent ");
		}
		sc.close();
	}

}
