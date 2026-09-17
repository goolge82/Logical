package com.javaLogical;

import java.util.Scanner;

public class Logical21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number:- ");
		int a=sc.nextInt();
		
		if(a==0) {
			System.out.println(a+" it is a zero");
		}
		else {
			System.out.println(a+" it is a non-zero");
		}
		
		sc.close();
	}

}
