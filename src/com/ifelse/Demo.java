package com.ifelse;

import java.util.Scanner;

public class Demo {
	static void Demo() {
		Scanner sc=new Scanner(System.in); 	
		System.out.println("enter number");
		int num1=sc.nextInt();
		if(num1==1||num1==2||num1==3||num1==5||num1==7)
			System.out.println("prime number");
		else if(num1%2>0&&num1%3>0&&num1%5>0&&num1%7>0)
			System.out.println("prime number");
		else
			System.out.println("not prime number");
	}


	
	
		
	


public static void main(String[] args) {
	Demo() ;
}
}








