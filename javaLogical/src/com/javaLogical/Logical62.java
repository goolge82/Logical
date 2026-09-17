package com.javaLogical;

import java.util.Scanner;

public class Logical62 {

	public static void main(String[] args) {

//		1.Create a Java program for a Food Ordering System using switch-case.
//		Requirements:
//		Display the following menu:
//		1 → Pizza – ₹200
//		2 → Burger – ₹120
//		3 → Biryani – ₹180
//		4 → Noodles – ₹100
//		Ask the user to select an item and enter the quantity.
//		Calculate the total bill = item price × quantity.
//		Output:

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------------------");
		System.out.println("                 Welcome to Vcube-donals            ");
		System.out.println("----------------------------------------------------");
		System.out.println();

		System.out.println("Vcube-donals Menu");
		System.out.println();
		System.out.println("1->pizza");
		System.out.println("2->Burger");
		System.out.println("3->Biryani");
		System.out.println("4->Noodles");

		System.out.println();
		
		String yn="";
		double price=0;
		

		do {
			
			System.out.println("enter your iteam please:- ");
			String iteam = sc.next();
			

			switch (iteam) {

			case "p" -> {

				System.out.println("pizza price is 200rs");
				double p_price=200.0;
				
				System.out.println("enter quantity:- ");
				double pq=sc.nextDouble();
				p_price=p_price*pq;
				price=price+p_price;
			}

			case "b" -> {
				System.out.println("Burger price is 120rs");
				System.out.println("enter quantity:- ");
				double b=sc.nextDouble();
				price+=b*120;

			}

			case "br" -> {
				System.out.println("Briyani price is 240rs");
				System.out.println("enter quantity:- ");
				double br=sc.nextDouble();
				price+=br*240;

			}

			case "n" -> {
				System.out.println("Noodles price is 150rs");
				System.out.println("enter quantity:- ");
				double n=sc.nextDouble();
				price+=n*150;

			}
			
			default->{
				System.out.println("give iteam is not available right now!!");
			}
			}
			System.out.println("do you want to continou to add orders(y/n):- ");
			yn=sc.next();
			
		}while(yn.equalsIgnoreCase("y"));
		
		System.out.println("thank you for ordering in Vcube-donals");
		System.out.println("your total bill is:- "+price);
		

		sc.close();
	}

}
