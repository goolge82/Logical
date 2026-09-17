package com.javaLogical;

import java.util.Scanner;

public class Logical11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Temperature Check
//		Enter temperature. If temperature is above 30°C, print "Hot", otherwise "Normal".

		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the temperratur:- ");
		double temp=sc.nextDouble();
		
		if(temp<=30.0) {
			System.out.println(temp +" you have normal temperatur");
		}
		else {
			System.out.println(temp+" you have hot");
		}
		
		sc.close();
	}

}
