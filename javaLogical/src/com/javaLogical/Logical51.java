package com.javaLogical;

import java.util.Scanner;

public class Logical51 {

	public static void main(String[] args) {

//		19. Loan Amount
		
//		Below ₹1 lakh → Small Loan
//		₹1–5 lakh → Medium Loan
//		₹5–10 lakh → Large Loan
//		₹10–25 lakh → High Loan
//		Above ₹25 lakh → Very High Loan
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter loan amount:- ");
		double l=sc.nextDouble();
		
		if(l>=1 && l<=5) {
			System.out.println("your loan is "+l+"lakhs it is very low loan");
		}
		else if(l>=6 && l<=10) {
			System.out.println("your loan is "+l+"lakhs it is medium loan");
		}
		else if(l>=11 && l<=25) {
			System.out.println("your loan is "+l+"lakhs it is high loan");
		}
		else {
			System.out.println("your loan is "+l+"lakhs it is very high loan");
		}
		
		sc.close();
		
	}

}
