package com.javaLogical;

import java.util.Scanner;

public class Logical10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Eligible for Exam
//		Enter attendance percentage. If attendance is 75% or above, print "Eligible for exam".

		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("enter the attendence:- ");
		
		double a=sc.nextDouble();
		
		if(a>=75) {
			System.out.println("your attendence is "+a+"%  so your eligible for exam");
		}
		
		else {
			System.out.println("your attendence is "+a+"%  so your not eligible for exam");
		}
		
		sc.close();
	}

}
