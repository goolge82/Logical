package com.javaLogical;

import java.util.Scanner;

public class Logical38 {

	public static void main(String[] args) {
		
//		6. Electricity Units
		
//		0–100 → Low Usage
//		101–200 → Normal Usage
//		201–300 → Medium Usage
//		301–500 → High Usage
//		Above 500 → Very High Usage

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your electricity units:- ");
		int u=sc.nextInt();
		
		if(u>=0 && u<=100) {
			System.out.println(u+" your electricity is low usage");
		}
		else if(u>101 && u<=200) {
			System.out.println(u+" your electricity is Normal usage");
		}
		else if(u>201 && u<=300) {
			System.out.println(u+" your electricity is Medium usage");
		}
		else if(u>301 && u<=500) {
			System.out.println(u+" your electricity is High usage");
		}
		else {
			System.out.println(u+" your electricity is Very High usage");
		}
		sc.close();
	}

}
