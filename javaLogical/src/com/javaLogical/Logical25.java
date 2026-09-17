package com.javaLogical;

import java.util.Scanner;

public class Logical25 {

	public static void main(String[] args) {

		
//		Profit or Loss – Compare cost price and selling price.
		
//		profit-->sp
//		loss--->cp
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the selling price");
		double sp=sc.nextDouble();
		
		System.out.println("enter the cost price");
		double cp=sc.nextDouble();
		
		if(sp>cp) {
			System.out.println("so profit will get");
		}
		
		else {
			System.out.println("so loss will get");
		}
		
		sc.close();
		
	}

}
