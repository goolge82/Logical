package com.javaLogical;

import java.util.Scanner;

public class Logical56 {

//	Calculator – Enter an operator +, -, *, / and perform the operation.

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		String yn="";
		
		do {
		System.out.println("enter a number:- ");
		double a=sc.nextInt();
		
		System.out.println("enter b number:- ");
		double b=sc.nextInt();
		
		System.out.println("enter which symbol +,-,*,/,% :- ");
		sc.nextLine();
		String sym=sc.nextLine();
		
		switch(sym) {
		
		case "+":
			System.out.println("sum of "+a+" and "+b+" ="+(a+b));
			break;
		case "-":
			System.out.println("difference of "+a+" and "+b+" ="+(a-b));
			break;
			
		case "*":
			System.out.println("product of "+a+" and "+b+" ="+(a*b));
			break;
			
		case "/":
			System.out.println("quoient of "+a+" and "+b+" ="+(a/b));
			break;
		case "%":
			System.out.println("reminder of "+a+" and "+b+" ="+(a%b));
			break;
		default:
			System.out.println("given symbol is invaild");
		
		}
		 System.out.println("Do you want to continue? (yes/no):");
         yn = sc.nextLine();

     } while (yn.equalsIgnoreCase("yes"));

     System.out.println("Calculator stopped.");
     
     sc.close();
	}

}
