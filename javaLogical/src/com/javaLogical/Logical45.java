package com.javaLogical;

import java.util.Scanner;

public class Logical45 {

	public static void main(String[] args) {

//		13. Internet Data Usage
		
//		0–1 GB → Very Low
//		1–5 GB → Low
//		5–15 GB → Medium
//		15–30 GB → High
//		Above 30 GB → Very High
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your internet usage:- ");
		int d=sc.nextInt();
		
		if(d>=0 && d<=1) {
			System.out.println("your data usage is "+d+" so your using very low data usage");
		}
		else if(d>=1 && d<=5) {
			System.out.println("your data usage is "+d+" so your using low data usage");
		}
		else if(d>=6 && d<=15) {
			System.out.println("your data usage is "+d+" so your using Medium data usage");
		}
		else if(d>=16 && d<=30) {
			System.out.println("your data usage is "+d+" so your using high data usage");
		}
		else {
			System.out.println("your data usage is "+d+" so your using very high data usage");

		}
		sc.close();
		
	}

}
