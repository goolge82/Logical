package com.javaLogical;

import java.util.Scanner;

public class Logical61 {

	public static void main(String[] args) {

//		Area Calculator
//		Enter 1 for Circle, 2 for Rectangle, 3 for Square, 4 for Triangle and calculate the area.
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("1) area of Circle");
		System.out.println("2) area of Rectangle");
		System.out.println("3) area of Square");
		System.out.println("4) area of Triangle");
		
		System.out.println("enter your choice:- ");
		int a=sc.nextInt();
		
		switch(a) {
		
		case 1:
			System.out.println("enter area of circle:- ");
			double r=sc.nextDouble();
			double area=(Math.PI)*r*r;
			
			System.out.println("area of circle:- "+area);
			break;
			
		case 2:
			System.out.println("enter length of rectangle:- ");
			double l=sc.nextDouble();
			System.out.println("enter breadth of rectangle:- ");
			double b=sc.nextDouble();
			double area1=l*b;
			
			System.out.println("area of circle:- "+area1);
			break;
			
		case 3:
			System.out.println("enter side of a square:- ");
			double s=sc.nextDouble();
			double area2=s*s;
			
			System.out.println("area of circle:- "+area2);
			break;
			
		case 4:
			System.out.println("enter base of triangle:- ");
			double base=sc.nextDouble();
			System.out.println("enter height of triangle:- ");
			double height=sc.nextDouble();
			double area3=0.5*base*height;
			
			System.out.println("area of circle:- "+area3);
			break;
			
		default:
			System.out.println("Invaild ");

		}
		
		sc.close();
	}

}
