package com.forloopdemo;

import java.util.Scanner;

public class ForLoopDemo {
static void forloop() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num");
	int a=sc.nextInt();
	for (int i=8; i<=80;i++) {
		if(i%8==0)
	 {
		System.out.println("Table i==="+i);
		}
	}
}
public static void main(String[] args) {
	forloop();
}	
}
