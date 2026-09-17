package com.javaLogical;

import java.util.Scanner;

public class Logical48 {

	public static void main(String[] args) {
		
		
//		16. Credit Score
		
//		Below 550 → Poor
//		550–649 → Average
//		650–749 → Good
//		750–799 → Very Good
//		800+ → Excellent

		Scanner sc= new Scanner(System.in);
		System.out.println("enter your credit score:- ");
		int s=sc.nextInt();
		
		if(s<550) {
			System.out.println("your credit score is "+s+" so you have very poor credit score so can't get any offers");
		}
		else if(s>=550 && s<=649) {
			System.out.println("your credit score is "+s+" so you have averge credit score so  get limited offers");
		}
		else if(s>=650 && s<749) {
			System.out.println("your credit score is "+s+" so you have good credit score so  get  offers");
		}
		else if(s>=750 && s<=799) {
			System.out.println("your credit score is "+s+" so you have very good credit score so  get unlimited offers");
		}
		else {
			System.out.println("your credit score is "+s+" so you have Excellent credit score so  get perimum offers");
		}
		sc.close();
		
	}

}
