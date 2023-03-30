package com.switchdodemo;

import java.util.Scanner;

public class SwitchDoDemo {
static void SwitchDoDemo() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int num1=sc.nextInt();
	
	
	boolean flag=false;
	do {
	System.out.println("1.Even number 2.Prime number 3.Febonacci series");
	System.out.println("Enter ur Choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		for(num1=1;num1<=10;num1++)
		if(num1%2==0) {
			System.out.println("Even number===="+num1);
		}
			break;
				
		
	case 2:
		for(num1=1; num1<=10; num1++)
		if (num1==1|| num1==2|| num1==3|| num1==5|| num1==7) {
			System.out.println("Prime number====="+num1);
		}
		else if(num1%2>0&& num1%3>0&& num1%5>0&& num1%7>0) {
			System.out.println("Prime number");
		}
		break;
	
	
	case 3:
		int a=0 ;
		int b=1;
		System.out.println(a+"");
		System.out.println(b+"");
		for(int i=3;i<=10;i++) {
			int c=a+b;
			System.out.println(c+"");
			a=b;
			b=c;
			
		}
		break;
		
		
		default:
			System.out.println("Invalid choice");
}
		System.out.println("Do you want countinoun");
		String AA=sc.next();
		if(AA.contains("y")){
			flag=true;
		}else {
			flag=false;
		}
		}while(flag);
	
	


}
public static void main(String[] args) {
	SwitchDoDemo();
}


}

