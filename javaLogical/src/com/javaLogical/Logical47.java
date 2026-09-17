package com.javaLogical;

import java.util.Scanner;

public class Logical47 {

	public static void main(String[] args) {

//		15. Employee Experience
		
//		0–1 years → Fresher
//		2–3 years → Junior
//		4–6 years → Experienced
//		7–10 years → Senior
//		Above 10 years → Expert
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your experience:- ");
		int e=sc.nextInt();
		
		if(e>=0 && e<=1) {
			System.out.println("your experience is "+e+"years so you will consider as fresher");
		}
		else if(e>=2 && e<=3) {
			System.out.println("your experience is "+e+"years so you will consider as Junior");
		}
		else if(e>=4 && e<=6) {
			System.out.println("your experience is "+e+"years so you will consider as Experienced");
		}
		else if(e>=7 && e<=10) {
			System.out.println("your experience is "+e+"years so you will consider as Senior");
		}
		else {
			System.out.println("your experience is "+e+"years so you will consider as Expert");
		}
		sc.close();
	}

}
