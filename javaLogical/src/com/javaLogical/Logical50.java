package com.javaLogical;

import java.util.Scanner;

public class Logical50 {

	public static void main(String[] args) {

//		18. Distance Travelled
		
//		0–5 km → Very Short
//		6–20 km → Short
//		21–50 km → Medium
//		51–100 km → Long
//		Above 100 km → Very Long
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your distance travelled:- ");
		int d=sc.nextInt();
		
		if(d>=0 && d<=5) {
			System.out.println("you travelled "+d+"km you coverd very short distance");
		}
		else if(d>=6 && d<=20) {
			System.out.println("you travelled "+d+"km you coverd  short distance");
		}
		else if(d>=21 && d<=50) {
			System.out.println("you travelled "+d+"km you coverd  Medium distance");
		}
		else if(d>=51 && d<=100) {
			System.out.println("you travelled "+d+"km you coverd  Long distance");
		}
		else {
			System.out.println("you travelled "+d+"km you coverd  Very long distance");
		}
		
		sc.close();
	}

}
