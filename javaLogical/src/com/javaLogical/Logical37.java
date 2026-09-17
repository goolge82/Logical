package com.javaLogical;

import java.util.Scanner;

public class Logical37 {

	public static void main(String[] args) {
		
//		5. Speed of Vehicle
		
//		0–30 km/h → Slow
//		31–60 → Normal
//		61–90 → Fast
//		91–120 → Very Fast
//		Above 120 → Overspeed
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your vehicle speed:- ");
		int speed=sc.nextInt();
		
		if(speed<0) {
			System.out.println(speed+" you haven't start at your vehicle");
		}
		else if(speed>=0 && speed<=30) {
			System.out.println(speed+ "km/h your speed is slow so your in safe driving");
		}
		else if(speed>=31 && speed<=60) {
			System.out.println(speed+ "km/h your speed is normal so your in safe driving");
		}
		else if(speed>=61 && speed<=90) {
			System.out.println(speed+ "km/h your speed is fast so your in risky driving");
		}
		else if(speed>=91 && speed<=120) {
			System.out.println(speed+ "km/h your speed is very fast so your in dangerous driving");
		}
		else {
			System.out.println(speed+ "km/h your speed is over speed so your going to god");
		}
		
		sc.close();	

	}

}
