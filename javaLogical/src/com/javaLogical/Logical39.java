package com.javaLogical;

import java.util.Scanner;

public class Logical39 {

	public static void main(String[] args) {

//		7. BMI Category
		
//		BMI---->body mass index
		
//		Below 18.5 → Underweight
//		18.5–24.9 → Normal
//		25–29.9 → Overweight
//		30+ → Obese
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your weight:- ");
		double w=sc.nextDouble();
		
		if(w<65.0) {
			System.out.println("your weight is "+w+" so your in under weight");
		}
		else if(w>=65.0 && w<=70.0) {
			System.out.println("your weight is "+w+" so your in Normal weight");
		}
		else if(w>=71.0 && w<=80.0) {
			System.out.println("your weight is "+w+" so your in  Normal weight");
		}
		else if(w>=81.0 && w<=90.0) {
			System.out.println("your weight is "+w+" so your in  Medium weight");
		}
		else{
			System.out.println("your weight is "+w+" so your have over weight");
		}
		sc.close();
	}

}
