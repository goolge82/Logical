package com.javaLogical;

import java.util.Scanner;

public class Logical29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Email Check
//		Enter an email. Check whether it matches a predefined email.
		
		Scanner sc=new Scanner(System.in);
		
		String user_email="chittemcharan7321@gmail.com";
		
		System.out.println("enter the email:- ");
		String email=sc.nextLine();
		
		if(user_email.equals(email)) {
			System.out.println("email id is matched");
		}
		else {
			System.out.println("email id is  not matched");
		}
		
		sc.close();

	}

}
