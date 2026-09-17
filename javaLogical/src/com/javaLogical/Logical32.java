package com.javaLogical;

import java.util.Scanner;

public class Logical32 {

	public static void main(String[] args) {

//		daily work
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your time:- ");
		double time=sc.nextDouble();
		
		if(time>=7.00 && time<=7.30) {
			System.out.println("walkup at moring at "+ time +" am and going to bath");
		}
		else if(time>=7.31 && time<=7.50) {
			System.out.println("having breakfast at "+ time+ " am ");
		}
		else if(time>=7.50 && time<=8.00) {
			System.out.println("going to insititute at"+ time+" am");
		}
		else if(time>=8.00 && time<=9.00) {
			System.out.println("listening sql class at");
		}
		else if(time>=9.00 && time<=10.00) {
			System.out.println("lab session");
		}
		else if(time>=10.00 && time<=11.00) {
			System.out.println("listening java class");
		}
		else if(time>=11.00 && time<=12.00) {
			System.out.println("lab session");
		}
		else if(time>=12.00 && time<=12.30) {
			System.out.println("going to hostel");
		}
		else if(time>=12.30 && time<=13.00) {
			System.out.println("playing clash of clans");
		}
		else if(time>=13.00 && time<=14.00) {
			System.out.println("having lunch");
		}
		else if(time>=14.00 && time<=16.00) {
			System.out.println("watching mobile");
		}
		else if(time>=16.00 && time<=17.00) {
			System.out.println("small sleep");
		}
		else if(time>=17.00 && time<=20.00) {
			System.out.println("study hour");
		}
		else if(time>=20.00 && time<=20.30) {
			System.out.println("having dinner");
		}
		else if(time>=20.30 && time<=21.00) {
			System.out.println("watching mobile");
		}
		else if(time>=21.00 && time<=23.00) {
			System.out.println("study hour");
		}
		else if(time>=23.00 && time<=24.00) {
			System.out.println("reading manga");
		}
		else {
			System.out.println("going to sleep");
		}
		
		sc.close();
	}

}
