package com.simpliiearn.calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main (String [] args) {
		
		//store two numbers
		double num1,num2;
		
		//take input from the user
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter the numbers");
		
		//take inputs from user
		num1 =sc.nextDouble();
		num2 =sc.nextDouble();
		
		//choosing the operators
		System.out.println("choose the opeartors(+,-,*,/)");
		
		char operator=sc.next().charAt(0);
		double output=0.0;
		
		switch (operator) {
		
		case '+' :
			output = num1+num2;
			System.out.println(output);
			break;
			
		case '-' :
			output = num1-num2;
			System.out.println(output);
			break;
			
		case '*' :
			output = num1*num2;
			System.out.println(output);
			break;
			
		case '/' :
			output = num1/num2;
			System.out.println(output);
			break;
		}	
	}
}
