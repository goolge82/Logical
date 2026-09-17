package com.javaLogical;

import java.util.Scanner;

public class Logical34 {

	public static void main(String[] args) {

//		2. Temperature
		
//		Below 0 → Freezing
//		0–15 → Very Cold
//		16–25 → Cold
//		26–35 → Normal
//		36–45 → Hot
//		Above 45 → Extremely Hot
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the temperature:- ");
		double t=sc.nextDouble();
		
		if(t<=0) {
			System.out.println(t+" is freezing!! 🥶🥶🥶🥶");
		}
		else if(t>=0 && t<=15){
			System.out.println(t+" is very cold!!🌬️🌬️");
		}
		else if(t>=16 && t<=25){
			System.out.println(t+" is  cold!!🌬️");
		}
		else if(t>=26 && t<=35){
			System.out.println(t+" is normal!!🌞🌞🌞");
		}
		else if(t>=36 && t<=45){
			System.out.println(t+" is Hot!!☄️☄️☄️");
		}
		else {
			System.out.println(t+" is Exterm Hot!!🌡️🌡️🌡️🌡️");
		}
		
		sc.close();
		
	}

}
