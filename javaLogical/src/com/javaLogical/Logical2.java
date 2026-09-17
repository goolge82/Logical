package com.javaLogical;

import java.util.Scanner;

public class Logical2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		int age=sc.nextInt();
		
		if(age>=18)
			
//			in java we don't need to use flower brackets we can still success fully we can exceute.
			
			System.out.println("congratulation !!");
//		    System.out.println("ypur eligible for voting and driving");
		    
		else
			System.out.println("no your no eligible for voting and driving");
		    System.out.println("come next year. have a nice day!!");
		    
		    
//		    so in java we don't need to use flower brackets for if/if else condition it still work but as for developers we use flower brakets for better readability
		    
//		    if it only see condition then next line will be print/not if there is next sysoutprint is there means
//		    it is not if conditon line it is next line it will print even condition is false also
		    
//		    if like that means there means else will give error
		    
//		    “It will give an 'else' without 'if' error because, without curly braces, 
//		    only the first statement is considered part of the if. 
//		    The second statement ends the if statement, so the else has no matching if.
		    	
		sc.close();
	}

}
