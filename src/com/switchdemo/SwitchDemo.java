package com.switchdemo;

import java.util.Scanner;

public class SwitchDemo {
public static void main(String[] args) {
	switchstatement();
}
static void switchstatement() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int num1=sc.nextInt();
	System.out.println("1.even odd 2.febonnaci 3.factorise 4.prime number");
	System.out.println("enter ur choice");
	int choice=sc.nextInt();
	
	switch(choice) {
	case 1:
		if(num1%2==0) {
			System.out.println("Number is Even");
			 
		}
		else {
			System.out.println("Number is Odd");
		}
		break;
	case 4:
		if(num1==1|| num1==2|| num1==3|| num1==5|| num1==7)
			System.out.println("Number is Prime");
		else if(num1%2>0&& num1%3>0&& num1%5>0&& num1%7>0)
			System.out.println("Number is prime");
		else
			System.out.println("Not Prime");
	}
}
}
			 

	


