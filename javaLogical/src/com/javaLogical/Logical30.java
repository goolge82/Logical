package com.javaLogical;

import java.util.Scanner;

public class Logical30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Battery Check
//		Enter battery percentage. If battery is 20% or above, print "Battery is OK", otherwise "Low Battery".
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the batter percentage:- ");
		int bat=sc.nextInt();
		
		if(bat<20) {
			
			System.out.println("your battery is "+ bat + "% so put mobile on charge");
		}
		
		else {
			System.out.println("your battery is "+ bat + "% so you can use mobile");
		}
		
		sc.close();

	}

}
