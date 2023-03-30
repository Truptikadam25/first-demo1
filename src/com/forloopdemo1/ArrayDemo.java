package com.forloopdemo1;

import java.util.Arrays;

public class ArrayDemo {
static void arraydemo () {
	int ab[]=new int [5];
ab[0]=1;
ab[1]=2;
ab[2]=3;
ab[3]=4;
ab[4]=5;
System.out.println("Array===="+Arrays.toString(ab));
System.out.println("using for each loop");

for (int num:ab) {
	if(num%2==0)
		System.out.println("even number==="+num);
}
}
public static void main(String[] args) {
	arraydemo();
}
}
