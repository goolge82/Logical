package com.javaLogical;

import java.util.Scanner;

public class Logical58 {

	public static void main(String[] args) {

		
//		Traffic Signal
//		Enter red, yellow, or green and display the appropriate action.
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter signal:- ");
		String s=sc.nextLine();
		
		switch(s) {
		
		case "red":
			System.out.println("it is "+s+ " so you need to Stop");
			break;
		
		case "yellow":
			System.out.println("it is "+s+ " so you need to Wait");
			break;
			
		case "green":
			System.out.println("it is "+s+ " so you need to Go");
			break;
			
		default:
			System.out.println("your singla is invaild");
		}
		
		sc.close();
		
	}

}
