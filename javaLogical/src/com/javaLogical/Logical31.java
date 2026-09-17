package com.javaLogical;

import java.util.Scanner;

public class Logical31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks:- ");
		int marks=sc.nextInt();
		
		if(marks>100 || marks<0) {
			System.out.println("Invaild marks !!!😒😒😒");
		}else if(marks<=100 && marks>=92) {
			System.out.println("your marks are "+marks+" so you got S grade !! 😍😍😍");	
		}
		else if(marks<=91 && marks>=90) {
			System.out.println("your marks are "+marks+" so you got A grade 😍😍😍");
		}
		else if(marks<=89 && marks>=75) {
			System.out.println("your marks are "+marks+" so you got B grade 👌👌");
		}
		else if(marks<=74 && marks>=60) {
			System.out.println("your marks are "+marks+" so you got C grade ❤️❤️❤️");
		}
		else if(marks<=59 && marks>=40) {
			System.out.println("your marks are "+marks+" so you got D grade 👍👍👍");
		}else {
			System.out.println("your marks are "+marks+" so you get fail  😰😰😰😰");
		}
		
		sc.close();
	}

}


