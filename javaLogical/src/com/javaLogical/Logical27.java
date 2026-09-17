package com.javaLogical;

import java.util.Scanner;

public class Logical27 {

	public static void main(String[] args) {
		
//		Uppercase or Lowercase – Check whether a character is uppercase or lowercase.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the character:- ");
		char c=sc.next().charAt(0);
		
		if(c>='A' && c<='Z') {
			System.out.println(c+ " is UPPER CASE");
		}
		else {
			System.out.println(c+ " is lower case");
		}
		
		sc.close();

	}

}
