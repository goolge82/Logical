package com.javaLogical;

import java.util.Scanner;

public class Logical53 {

	public static void main(String[] args) {

//		21. Movie Rating
//		0–2 → Poor
//		3–4 → Average
//		5–6 → Okay
//		7–8 → Good
//		9–10 → Excellent
		
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		
		if(s>=0 && s<=2) {
			System.out.println("movie rating is "+s+" star rating  it is poor movie");
		}
		else if(s>=3 && s<=4) {
			System.out.println("movie rating is "+s+" star rating  it is Averge movie");
		}
		else if(s>=5 && s<=6) {
			System.out.println("movie rating is "+s+" star rating  it is Okay movie");
		}
		else if(s>=7 && s<=8) {
			System.out.println("movie rating is "+s+" star rating  it is Good movie");
		}
		else if(s>=9 && s<=10) {
			System.out.println("movie rating is "+s+" star rating  it is Excellent movie");
		}
		sc.close();
	}

}
