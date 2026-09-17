package com.javaLogical;

import java.util.Scanner;

public class Logical13 {

	public static void main(String[] args) {
		
		
//		Character is Vowel or Consonant
//		Check whether a given character is a, e, i, o, u.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the character:- ");
		
		char c=sc.next().charAt(0);
		
		if(c=='a'|| c=='e'||c=='o'||c=='i'||c=='u' ||c=='A'|| c=='E'||c=='O'||c=='I'||c=='U') {
			
			System.out.println(c + " is a vowel");
			
		}
		else {
			System.out.println(c + " is a consonent");
		}
		
		sc.close();

	}

}
