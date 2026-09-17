package com.javaLogical;

import java.util.Scanner;

public class Logical49 {

	public static void main(String[] args) {
		
//		17. Water Tank Level
		
//		0–20% → Empty
//		21–40% → Low
//		41–70% → Medium
//		71–90% → High
//		91–100% → Full

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the water level:- ");
		int w=sc.nextInt();
		
		if(w>=0 && w<=20) {
			System.out.println("your water take is "+w+"%  so your tanke is empty");
		}
		else if(w>=21 && w<=40) {
			System.out.println("your water take is "+w+"%  so your tanke is Low");
		}
		else if(w>=41 && w<=70) {
			System.out.println("your water take is "+w+"%  so your tanke is Medium");
		}
		else if(w>=71 && w<=90) {
			System.out.println("your water take is "+w+"%  so your tanke is High");
		}
		else if(w>=91 && w<=100) {
			System.out.println("your water take is "+w+"%  so your tanke is Full");
		}
		else {
			System.out.println("your water take is "+w+"%  so your tanke is Full");
			System.out.println("but water is wasting even after tanke is full");
		}
		sc.close();
	}

}
