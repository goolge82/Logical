package com.javaLogical;

import java.util.Scanner;

public class Logical18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Salary Bonus
//		Enter employee salary. If salary is below ₹30,000, give 10% bonus; otherwise, give 5% bonus.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the salary:- ");
		double s=sc.nextDouble();
		
		if(s<=30000) {
			System.out.println("your salary is "+s+" so you will get 10% bouns");
		}
		else {
			System.out.println("your salary is "+s+" so you will get 5% bouns");
		}

		sc.close();
	}

}
