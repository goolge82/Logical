package com.javaLogical;

import java.util.Scanner;

public class Logical28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Username Check
//		Enter a username. Check whether it matches the correct username.
		
		Scanner sc=new Scanner(System.in);
		
		String user="charan";
		
		System.out.println("enter the name:- ");
		String name=sc.nextLine();
		
		if(user.equals(name)) {
			System.out.println("user name is vaild");
		}
		else {
			System.out.println("user name is invaild");
		}
		
		sc.close();

	}

}
