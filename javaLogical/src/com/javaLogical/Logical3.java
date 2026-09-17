package com.javaLogical;

import java.util.Scanner;

public class Logical3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name:- ");
		String name=sc.nextLine();
		
		if(name.length()>=15) {
			System.out.println("sorry! you need to shorten your name");
			System.out.println("so please short your name");
		}
		else {
			System.out.println("Mr."+name);
			System.out.println("now you can applied the application");
		}
		
//		.length() it is one of string method 
//		it finds the length of the string
//		we given grater than 15 so that means we need to shorten the name
//		at else if name is below are equal it will give now you can applied the application
		
		sc.close();
	}

}
