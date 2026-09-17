package com.javaLogical;

import java.util.Scanner;

public class Logical55 {

	public static void main(String[] args) {

//		23.Package Delivery Distance
//		0–5 km → Nearby
//		6–20 km → Short Distance
//		21–50 km → Medium Distance
//		51–100 km → Long Distance
//		Above 100 km → Very Long Distance

		Scanner sc = new Scanner(System.in);
		System.out.println("enter delivery distance:- ");
		int d = sc.nextInt();

		if (d >= 0 && d <= 5) {
			System.out.println("delivery distance is " + d + "km so it is near by distance");
		} else if (d >= 6 && d <= 20) {
			System.out.println("delivery distance is " + d + "km so it is short by distance");
		} else if (d >= 21 && d <= 50) {
			System.out.println("delivery distance is " + d + "km so it is Medium by distance");

		} else if (d >= 51 && d <= 100) {
			System.out.println("delivery distance is " + d + "km so it is Long by distance");
		} else {
			System.out.println("delivery distance is " + d + "km so it is very long by distance");
		}
		sc.close();
	}

}
