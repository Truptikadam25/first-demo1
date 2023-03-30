package com.ifelseif;

import java.util.Scanner;

public class IfElseIf {

static void ifstatementdemo() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter ur age");
	int age=sc.nextInt();
	
	if(age>18)
		System.out.println("ur eligible for voting");
	System.out.println("ur not eligible fir voting");
}

public static void main(String[] args) {
//	ifstatementdemo();
//	ifstateDemo();
//	ifelseifdemo();
	//IfElseIfDemo();
	//ifelseDemo();
	forloop();
}


static void ifstateDemo() {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	if ( num%2==0)
		System.out.println("Even number");
	System.out.println("Odd numer");
}
static void ifelseifdemo() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	if(a%2==0)
		System.out.println("Even number");
	else
		System.out.println("odd number");
}
static void IfElseIfDemo() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first num");
	int num1=sc.nextInt();
	System.out.println("enter second num");
	int num2=sc.nextInt();
	System.out.println("1.Add 2.Sub 3.Mul 4.Div");
	System.out.println("enter ur choice");
	int choice=sc.nextInt();
	if(choice ==1) {
		System.out.println("Add===="+num1+num2);
		
	}else if(choice==2) {
		System.out.println("Sub===="+(num1-num2));
	
	
}else if(choice==3) {
	System.out.println("Mul===="+(num1*num2));
}else if(choice==4) {
	System.out.println("Div==="+(num1/num2));
}else {
	System.out.println("invalid choice");
}
}
 static void ifelseDemo(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	if(num==1|| num==2|| num==3|| num==5|| num==7)
		System.out.println("prime number");
	else if(num%2>0&& num%3>0&& num%5>0&& num%7>0)
			System.out.println("prime number");
	else
		System.out.println("not prime number");
		 
}
 static void forloop() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number");
	 int num=sc.nextInt();
	 for(int i=1; i<=10; i++) {
		 System.out.println("series==="+num*i);
	 }
 }
}


