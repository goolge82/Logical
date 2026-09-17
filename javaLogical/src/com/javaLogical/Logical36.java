package com.javaLogical;

import java.util.Scanner;

public class Logical36 {

	public static void main(String[] args) {
		
//		4. Salary Category
		
//		Below 20,000 → Low Salary
//		20,000–40,000 → Average Salary
//		40,001–60,000 → Good Salary
//		60,001–1,00,000 → High Salary
//		Above 1,00,000 → Very High Salary
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your salary:- ");
		double sal=sc.nextDouble();
		
		if(sal<20000) {
			System.out.println("your salary is "+sal+" so you comes to low salary catagory");
		}
		else if(sal>=20000 && sal<=40000) {
			System.out.println("your salary is "+sal+" so you comes to Average salary catagory");
		}
		
		else if(sal>=40001 && sal<=60000) {
			System.out.println("your salary is "+sal+" so you comes to good salary catagory");
		}
		else if(sal>=60001 && sal<=100000) {
			System.out.println("your salary is "+sal+" so you comes to High salary catagory");
		}
		else if(sal>=100000) {
			System.out.println("your salary is "+sal+" so you comes to Highest salary catagory");
		}

		sc.close();
	}

}
