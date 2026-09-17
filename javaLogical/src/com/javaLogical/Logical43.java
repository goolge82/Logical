package com.javaLogical;

import java.util.Scanner;

public class Logical43 {

	public static void main(String[] args) {

//		11. Monthly Expenses
		
//		Below ₹5,000 → Very Low
//		₹5,000–₹10,000 → Low
//		₹10,001–₹20,000 → Medium
//		₹20,001–₹40,000 → High
//		Above ₹40,000 → Very High
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your monthly expense:- ");
		int m=sc.nextInt();
		
		if(m<5000) {
			System.out.println("your monthly expense "+m+" so you have very low expense");
		}
		else if(m>=5000 && m<=10000) {
			System.out.println("your monthly expense "+m+" so you have low expense");			
		}
		else if(m>=10001 && m<=20000) {
			System.out.println("your monthly expense "+m+" so you have Medium expense");			
		}
		else if(m>=20001 && m<=40000) {
			System.out.println("your monthly expense "+m+" so you have High expense");			
		}
		else {
			System.out.println("your monthly expense "+m+" so you have very High expense");			
		}
		sc.close();
		
	}

}
