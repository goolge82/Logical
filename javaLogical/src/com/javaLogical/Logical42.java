package com.javaLogical;

import java.util.Scanner;

public class Logical42 {

	public static void main(String[] args) {
		
//		10. Exam Attendance
		
//		Below 50% → Very Low
//		50–74% → Low
//		75–84% → Good
//		85–94% → Very Good
//		95–100% → Excellent

		Scanner sc=new Scanner(System.in);
		System.out.println("enter your attendence:- ");
		double a=sc.nextDouble();
		
		if(a<50) {
			System.out.println("your attendence is "+a+"% so you have low so maintain attendence");
		}
		else if(a>=50 && a<=74) {
			System.out.println("your attendence is "+a+"% so you have low so maintain attendence");
		}
		else if(a>=75 && a<=84) {
			System.out.println("your attendence is "+a+"% so you have good  attendence");
		}
		else if(a>=85 && a<=94) {
			System.out.println("your attendence is "+a+"% so you have very good  attendence");
		}
		else {
			System.out.println("your attendence is "+a+"% so you have excellent  attendence");

		}
		
		sc.close();
		
	}

}
