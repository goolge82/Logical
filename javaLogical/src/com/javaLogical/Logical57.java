package com.javaLogical;

import java.util.Scanner;

public class Logical57 {
	
//	Vowel Checker
//	Enter a character and use switch to check a, e, i, o, u.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter alphabet:- ");
		char c=sc.next().charAt(0);
		
		switch(c) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("it is a vowel");
			break;
		default:
			System.out.println("it is consoant");
		}
		
		sc.close();

	}

}
