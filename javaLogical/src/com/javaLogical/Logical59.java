package com.javaLogical;

import java.util.Scanner;

public class Logical59 {

	public static void main(String[] args) {

		
//		Menu-Driven Food Order
//		Enter 1 for Pizza, 2 for Burger, 3 for Biryani, 4 for Dosa and display the price.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("food item in menu");
		
		System.out.println("1)Pizza");
		System.out.println("2)Burger");
		System.out.println("3)Briyani");
		System.out.println("4)Dosa");
		
		System.out.println("enter your food iteam:- ");
		int iteam=sc.nextInt();
		
		
		switch(iteam) {
		
		case 1:
			System.out.println("food iteam is Pizza");
			System.out.println("it cost is $250");
			break;
			
		case 2:
			System.out.println("food iteam is Burger");
			System.out.println("it cost is $200");
			break;
			
		case 3:
			System.out.println("food iteam is Briyani");
			System.out.println("it cost is $150");
			break;
			
		case 4:
			System.out.println("food iteam is Dosa");
			System.out.println("it cost is $50");
			break;
			
		default:
			System.out.println("give iteam is not available in menu");
		}
		
		sc.close();

	}

}
