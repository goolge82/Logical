package com.javaLogical;

import java.util.Scanner;

public class Logical33 {

	public static void main(String[] args) {
		
		
//		1. Age Category
		
//		0–5 → Kid
//		6–12 → Children
//		13–19 → Teenage
//		20–35 → Young age
//		36–59 → Middle age
//		60+ → Elder age
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age:- ");
		int age=sc.nextInt();
		
		if(age<0) {
			System.out.println( "your age is "+age+ "Invaild age!! 😅😅😅");
		}
		else if(age>=0  && age<=5) {
			System.out.println( "your age is "+age+ " so your kid age!! 👶👶👶");
		}
		else if(age>=6  && age<=12) {
			System.out.println( "your age is "+age+ " so your Children age!! 👦👦👦👧👧👧");
		}

		else if(age>=13  && age<=19) {
			System.out.println( "your age is "+age+ " so your Teen age!! 🧑🧑🧑");
		}
		else if(age>=20  && age<=35) {
			System.out.println( "your age is "+age+ " so your youger age!! 🧑🏽🧑🏽🧑🏽");
		}
		else if(age>=36  && age<=59) {
			System.out.println( "your age is "+age+ " so your middle age!! 👨🏽‍🦰👨🏽‍🦰👨🏽‍🦰");
		}
		else{
			System.out.println( "your age is "+age+ " so your elder age!! 👨🏽‍🦳👨🏽‍🦳👨🏽‍🦳");
		}
		sc.close();
	}

}
