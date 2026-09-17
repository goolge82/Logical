package com.javaLogical;

import java.util.Scanner;

public class Logical35 {

	public static void main(String[] args) {
		
		
//		3. Student Marks
		
//		95–100 → S Grade
//		90–94 → A Grade
//		75–89 → B Grade
//		60–74 → C Grade
//		40–59 → D Grade
//		Below 40 → Fail
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your marks:- ");
		int marks=sc.nextInt();
		if(marks>100 || marks<0) {
			System.out.println("Invaild marks !!!😒😒😒");
		}else if(marks>=95 && marks<=100) {
			System.out.println("your marks are "+marks+" so you got S grade !! 😍😍😍");	
		}
		else if(marks>=90 && marks<=94) {
			System.out.println("your marks are "+marks+" so you got A grade 😍😍😍");
		}
		else if(marks>=75 && marks<=89) {
			System.out.println("your marks are "+marks+" so you got B grade 👌👌");
		}
		else if(marks>=60 && marks<=74) {
			System.out.println("your marks are "+marks+" so you got C grade ❤️❤️❤️");
		}
		else if(marks>=40 && marks<=59) {
			System.out.println("your marks are "+marks+" so you got D grade 👍👍👍");
		}else {
			System.out.println("your marks are "+marks+" so you get fail  😰😰😰😰");
		}
		
		sc.close();

	}

}
