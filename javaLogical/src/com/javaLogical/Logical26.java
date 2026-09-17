package com.javaLogical;

import java.util.Scanner;

public class Logical26 {

	public static void main(String[] args) {

		
//		Password Check – Check whether entered password matches the correct password.
		
		Scanner sc= new Scanner(System.in);
		
		
		
		String correct="charan123";
		
		System.out.println("enter the password:- ");
		String password=sc.nextLine();
		
		if(password.equals(correct)) {
			System.out.println("login successful");
		}
		else {
			System.out.println("invaild password");
		}
		
		sc.close();
		
		
	}

}
