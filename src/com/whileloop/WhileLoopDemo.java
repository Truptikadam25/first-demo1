package com.whileloop;

import java.util.Scanner;

public class WhileLoopDemo {
static void whileloop() {
	int i=1;
			do {
				if(i==1|| i==2|| i==3 || i==5|| i==7) {
				System.out.println("prime number===="+i);
				
				}else if(i%2>0&& i%3>0&& i%5>0&& i%7>0)
					System.out.println("prime number===="+i);
				i++;
			}while(i<=100);
}
public static void main(String[] args) {
//	whileloop();
//	dowhileloop();
//	dowhileloop1();
}

static void dowhileloop() {
	int i=1;
			do {
				if(i%2==0)
					System.out.println("Even Number====="+i);
				i++;
			}while(i<=100);
			
			
			
			
}			


static void dowhileloop1() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num1=sc.nextInt();
	
	int a=0;
	int b=1;
	System.out.println(a+"");
	System.out.println(b+"");
			for(int i=3;i<=10; i++) {
				int c=a+b;
				System.out.println(c+"");
				a=b;
				b=c;
			}

	
		
	}
			
}































