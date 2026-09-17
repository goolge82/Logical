package com.javaLogical;

import java.util.Scanner;

public class Logical14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the a :- ");
		int a=sc.nextInt();
		
		System.out.println("enter the b:- ");
		int b=sc.nextInt();
		
		if(a==b) {
			System.out.println(a+" and "+b +" are equal");
		}
		else {
			System.out.println(a+" and "+b +" are not equal");
		}
		
		sc.close();

	}

}
