package com.javaLogical;

import java.util.Scanner;

public class Logical60 {

	public static void main(String[] args) {

		
//		Simple ATM Menu
//		Enter 1 for Balance, 2 for Deposit, 3 for Withdraw, 4 for Exit.
		
		Scanner sc=new Scanner(System.in);
		
		double balance=2000;
		
		int a;
		do {
		System.out.println("ATM menu are");
		System.out.println("1.Balance");
		System.out.println("2.Deposite");
		System.out.println("3.With draw");
		System.out.println("4.Exit from atm");

		System.out.println("enter your choice:- ");
		a=sc.nextInt();
		
		
		switch(a) {
		
		case 1:
			System.out.println("your current balance is "+balance);
			break;
			
		case 2:
			System.out.println("enter your deposite amount:- ");
			double amount=sc.nextDouble();
			
			balance=balance+amount;
			
			System.out.println("deposite is successful");
			System.out.println("after deposite your current balance is:- "+balance);
			break;
			
		case 3:
			System.out.println("enter your with draw amount:- ");
			double amount1=sc.nextDouble();
			
			balance=balance- amount1;
			
			System.out.println("withdraw is successful");
			System.out.println(" your current balance is:- "+balance);
			break;
			
		case 4:
			System.out.println("your exit from atm");
			break;
		}
		
	}while(a!=4);
		
		sc.close();
	}

}
